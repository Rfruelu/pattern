package lesson.patten.battercake.v1;

/**
 * @author :lujia
 * @date :2019/4/30  9:35
 */
public class SausageBattercake extends BattercakeV1 {

    @Override
    public String getName() {
        return super.getName()+"加香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
