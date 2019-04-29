package lesson.patten.strategy.pay;

/**
 * @author :lujia
 * @date :2019/4/29  9:39
 */
public abstract class Payment {


    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract String getName();

    abstract void pay(double amount);

    protected boolean checkAmount(double amount){
        if (this.amount>amount){
            System.out.println("支付成功");
            return true;
        }
        System.out.println("支付失败，余额不足");
        return false;
    }
}
