package lesson.patten.power;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/29  15:14
 */
public class PowerTest {

    @Test
    public void test(){
        Adapter adapter=new Adapter();
        DC5 dc5= adapter.adapter(new AC220());
        System.out.println(dc5);
    }
}
