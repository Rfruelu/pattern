package lesson.patten.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单列
 * @author :lujia
 * @date :2019/4/28  13:45
 */
public class RegisterSingleton {


    private static Map<String,RegisterSingleton> registerSingletonMap;
    private RegisterSingleton(){ }

    /**
     * 已经使用了concurrentHashMap,为何还需要synchronized？
     *  concurrentHashMap是线程安全的，对 concurrentHashMap的get和set是原子性的
     *  但是getInstance并不是一个原子性的操作，要保证getInstance方法的原子性
     * @return
     */
    public static synchronized RegisterSingleton getInstance(){
        if (registerSingletonMap==null){
            registerSingletonMap=new ConcurrentHashMap<>();
        }
        RegisterSingleton registerSingleton = registerSingletonMap.get("RegisterSingleton");
        if (registerSingleton==null){
            registerSingleton=new RegisterSingleton();
        }
        registerSingletonMap.put("RegisterSingleton",registerSingleton);

        return registerSingleton;
    }

}

