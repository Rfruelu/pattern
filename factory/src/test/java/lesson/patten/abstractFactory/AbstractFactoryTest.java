package lesson.patten.abstractFactory;

import lesson.patten.Mobile;
import lesson.patten.Tv;
import org.junit.Test;

/**
 * 抽象工厂测试类
 * @author :lujia
 * @date :2019/4/23  23:03
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
        Factory factory=new XiaoMiFactory();

        Mobile mobile = factory.createMobile();
        System.out.println(mobile.call("hello"));

        Tv tv = factory.createTv();

        System.out.println(tv.watch());
    }
}
