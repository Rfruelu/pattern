package lesson.patten.battercake.v2;

/**
 * @author :lujia
 * @date :2019/4/30  10:32
 */
public class BattercakeDecroator extends Battercake{


    private Battercake battercake;

    public BattercakeDecroator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getName() {
        return battercake.getName();
    }

    @Override
    public int getPrice() {
        return battercake.getPrice();
    }
}
