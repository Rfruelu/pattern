package lesson.patten.staticProxy;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/28  15:26
 */
public class StaticProxyTest {

    @Test
    public void test(){
        Son son=new Son();
        Father father=new Father(son);
        father.find();
    }
}
