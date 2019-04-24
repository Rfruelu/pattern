package lesson.patten.factoryMethod;

import lesson.patten.IPhone;
import lesson.patten.Mobile;

/**
 * @author :lujia
 * @date :2019/4/23  22:22
 */
public class IPhoneFactory implements MobileFactory {
    @Override
    public Mobile createMobile() {
        return new IPhone();
    }
}
