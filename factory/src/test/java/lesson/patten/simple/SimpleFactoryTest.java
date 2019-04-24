package lesson.patten.simple;

import lesson.patten.IPhone;
import lesson.patten.Mobile;
import org.junit.Test;

/**
 * 简单工厂测试类
 * @author :lujia
 * @date :2019/4/23  22:24
 */
public class SimpleFactoryTest {

    @Test
    public void test(){
        Factory factory=new Factory();

        Mobile mobile=factory.create("IPhone");
        System.out.println(mobile.call("hello"));

    }

    @Test
    public void createByClassName(){
        Factory factory=new Factory();

        Mobile mobile=factory.createByClassName("lesson.patten.IPhone");
        System.out.println(mobile.call("hello"));

    }
    @Test
    public void createByClass(){
        Factory factory=new Factory();

        Mobile mobile=factory.createByClass(IPhone.class);

        System.out.println(mobile.call("hello"));
    }
}
