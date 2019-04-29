package lesson.patten.strategy.pay;

/**
 * @author :lujia
 * @date :2019/4/29  9:46
 */
public class JDPay extends Payment {
    public JDPay(double amount) {
        super(amount);
    }

    @Override
    public String getName() {
        return PayType.JD.getName();
    }

    @Override
    public void pay(double amount) {
        System.out.println("京东支付开始----支付金额:" + amount);
        checkAmount(amount);
    }
}
