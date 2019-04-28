package lesson.patten.register;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/28  13:53
 */
public class RegisteSingletonTest {

    @Test
    public void test(){
        RegisterSingleton instance = RegisterSingleton.getInstance();
        RegisterSingleton instanceTwo = RegisterSingleton.getInstance();

        System.out.println(instance==instanceTwo);

        System.out.println(instance);
        System.out.println(instanceTwo);

    }
}
