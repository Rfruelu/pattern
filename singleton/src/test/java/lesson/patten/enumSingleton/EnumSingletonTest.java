package lesson.patten.enumSingleton;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/28  13:58
 */
public class EnumSingletonTest {

    @Test
    public void test(){
        EnumSingleton one = EnumSingleton.ONE;
        EnumSingleton two = EnumSingleton.ONE;

        System.out.println(one==two);
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

    }
}
