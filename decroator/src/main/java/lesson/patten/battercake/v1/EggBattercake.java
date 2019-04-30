package lesson.patten.battercake.v1;

/**
 * 鸡蛋煎饼
 * @author :lujia
 * @date :2019/4/30  9:33
 */
public class EggBattercake  extends BattercakeV1 {


    @Override
    public String getName() {
        return super.getName()+"1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
