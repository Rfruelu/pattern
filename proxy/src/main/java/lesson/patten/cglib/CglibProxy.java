package lesson.patten.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Method;

/**
 * @author :lujia
 * @date :2019/4/28  16:13
 */
public class CglibProxy implements MethodInterceptor {


    public Object create(Object object){
        //Enhancer cglib的增强器，用来生成cglib代理对象
        Enhancer enhancer=new Enhancer();
        //设置父类-->即代理对象的class，应为cglib是利用继承实现
        enhancer.setSuperclass(object.getClass());
        //callback ，回调，就是增强的处理逻辑
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object getInstance(Object object){
        //Enhancer cglib的增强器，用来生成cglib代理对象
        Enhancer enhancer=new Enhancer();
        //设置父类-->即代理对象的class，应为cglib是利用继承实现
        enhancer.setSuperclass(object.getClass());
        //针对不同的方法，做不同的拦截处理   NoOp.INSTANCE表示null不做任何增强处理
        enhancer.setCallbacks(new Callback[]{this,new CglibDateProxy(), NoOp.INSTANCE});
        //如果是构造方法调用拦截的方法不做增强处理
        enhancer.setInterceptDuringConstruction(false);
        enhancer.setCallbackFilter((method)->{
            if ("eat".equals(method.getName())){
                //返回0表示使用setCallbacks数组的第0个元素
                return 0;
            }
            //返回1表示使用setCallbacks数组的第1个元素
            return 1;
        });
        return enhancer.create();
    }

    /**
     *
     * @param o 原始对象
     * @param method 拦截的方法
     * @param objects  拦截方法的参数列表
     * @param methodProxy 拦截方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //前置操作
        before();
        //执行
        Object result = methodProxy.invokeSuper(o, objects);
        //后置处理
        after();
        return result;
    }



    private void after() {
        System.out.println("cglib proxy after");
    }

    private void before() {
        System.out.println("cglib proxy before");
    }
}


class CglibDateProxy implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(System.currentTimeMillis());
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(System.currentTimeMillis());
        return result;
    }
}

class TestCallbackFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        if ("eat".equals(method.getName())){
            return 0;
        }
        return 1;
    }
}
