package lesson.patten.cglib;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/28  16:31
 */
public class CglibProxyTest {
    @Test
    public void test(){
        Girl g=new Girl();

        CglibProxy cglibProxy=new CglibProxy();
        Girl o = (Girl)cglibProxy.getInstance(g);
        o.eat();
        o.find();
    }
}
