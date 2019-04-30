package lesson.patten.battercake.v1;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/30  9:36
 */
public class BattercakeTest {

    /**
     * 不能支持加鸡蛋和香肠
     * 只能加其中一个
     */
    @Test
    public void test(){
        BattercakeV1 battercakeV1 =new BattercakeV1();

        System.out.println("battercakeV1:"+ battercakeV1.getName()+"价格:"+ battercakeV1.getPrice());

        battercakeV1 =new EggBattercake();
        System.out.println("battercakeV1:"+ battercakeV1.getName()+"价格:"+ battercakeV1.getPrice());

        battercakeV1 =new SausageBattercake();

        System.out.println("battercakeV1:"+ battercakeV1.getName()+"价格:"+ battercakeV1.getPrice());
    }
}
