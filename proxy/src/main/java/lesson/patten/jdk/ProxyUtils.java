package lesson.patten.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 * @author :lujia
 * @date :2019/4/28  15:31
 */

public class ProxyUtils implements InvocationHandler {

    private Object object;

    public Object getProxy(Object object){
        this.object=object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(object, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("jdk proxy after");
    }

    private void before() {
        System.out.println("jdk proxy before");
    }
}
