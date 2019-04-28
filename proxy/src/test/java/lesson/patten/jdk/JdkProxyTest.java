package lesson.patten.jdk;

import lesson.patten.staticProxy.Son;
import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/28  15:37
 */
public class JdkProxyTest {

    @Test
    public void  test(){
        Son son=new Son();
        ProxyUtils proxyUtils=new ProxyUtils();
        Person proxy = (Person) proxyUtils.getProxy(son);
        proxy.find();
    }
}
