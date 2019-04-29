package lesson.patten.strategy.pay;

/**
 * @author :lujia
 * @date :2019/4/29  9:46
 */
public class WeChatPay extends Payment {

    public WeChatPay(double amount) {
        super(amount);
    }

    @Override
    public String getName() {
        return PayType.WECHAT.getName();
    }

    @Override
    public void pay(double amount) {
        System.out.println("微信支付开始-----支付金额:" + amount);
        checkAmount(amount);
    }
}
