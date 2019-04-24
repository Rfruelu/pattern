package lesson.patten.factoryMethod;

import lesson.patten.Mobile;
import org.junit.Test;

/**
 * 工厂方法测试类
 * @author :lujia
 * @date :2019/4/23  22:48
 */
public class factoryMethodTest {


    @Test
    public void createIPhone(){
        MobileFactory factory=new IPhoneFactory();

        Mobile mobile=factory.createMobile();
        System.out.println(mobile.call("hello"));
    }

    @Test
    public void createXiaoMi(){
        MobileFactory factory=new XiaoMiFactory();

        Mobile mobile=factory.createMobile();
        System.out.println(mobile.call("hello"));
    }
}
