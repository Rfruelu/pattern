package lesson.patten.strategy.pay;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/29  9:56
 */
public class PayStrategyTest {

    @Test
    public void test(){
        Payment payment=PayType.valueOf("ALI").getPayment();
        System.out.println("支付方式name:"+payment.getName());
        payment.pay(100);
    }
}
