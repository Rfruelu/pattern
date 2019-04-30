package lesson.patten.battercake.v2;

/**
 * @author :lujia
 * @date :2019/4/30  9:58
 */
public class EggBattercake extends BattercakeDecroator{


    public EggBattercake(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getName() {
        return super.getName()+"加1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
