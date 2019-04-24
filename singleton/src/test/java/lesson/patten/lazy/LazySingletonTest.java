package lesson.patten.lazy;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/23  23:47
 */
public class LazySingletonTest {

    @Test
    public void test(){
        LazySingleton lazySingleton=LazySingleton.getInstance();

        System.out.println(lazySingleton);
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
        boolean b = lazySingleton == instance;
        System.out.println("==:"+b);
    }
}
