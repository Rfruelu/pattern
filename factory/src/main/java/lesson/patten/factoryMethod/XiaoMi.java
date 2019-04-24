package lesson.patten.factoryMethod;

import lesson.patten.Mobile;

/**
 * @author :lujia
 * @date :2019/4/23  22:29
 */
public class XiaoMi implements Mobile {
    @Override
    public String call(String message) {
        return "xiaomi call "+message;
    }
}
