package lesson.patten.strategy.pay;

/**
 * @author :lujia
 * @date :2019/4/29  9:43
 */
public class AliPay extends Payment {

    public AliPay(double amount) {
        super(amount);
    }

    @Override
    public String getName() {
        return PayType.ALI.getName();
    }

    @Override
    public void pay(double amount) {
        System.out.println("支付宝支付开始---支付金额:" + amount);
        checkAmount(amount);
    }
}
