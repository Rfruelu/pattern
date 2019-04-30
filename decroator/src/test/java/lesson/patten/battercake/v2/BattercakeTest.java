package lesson.patten.battercake.v2;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/30  10:00
 */
public class BattercakeTest {

    @Test
    public void test(){
        Battercake battercake=new BaseBattercake();

        System.out.println("name:"+battercake.getName()+"---价格:"+battercake.getPrice());
        battercake=new EggBattercake(battercake);
        System.out.println("name:"+battercake.getName()+"---价格:"+battercake.getPrice());
        battercake=new SausageBattercake(battercake);
        System.out.println("name:"+battercake.getName()+"---价格:"+battercake.getPrice());

    }
}
