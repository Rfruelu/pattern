package lesson.patten.battercake.v2;

/**
 * @author :lujia
 * @date :2019/4/30  9:59
 */
public class SausageBattercake extends BattercakeDecroator{

    public SausageBattercake(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getName() {
        return super.getName()+"加一个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
