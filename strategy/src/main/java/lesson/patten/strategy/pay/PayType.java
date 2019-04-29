package lesson.patten.strategy.pay;

/**
 * @author :lujia
 * @date :2019/4/29  9:44
 */
public enum  PayType {

    ALI("ALI",new AliPay(200)),
    WECHAT("WECHAT",new WeChatPay(100)),
    JD("JD",new JDPay(50));
    private String name;
    private Payment payment;

    public String getName() {
        return name;
    }

    public Payment getPayment() {
        return payment;
    }

    PayType(String name, Payment payment) {
        this.name = name;
        this.payment = payment;
    }
}
