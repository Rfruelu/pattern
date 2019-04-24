package lesson.patten.factoryMethod;

import lesson.patten.Mobile;

/**
 * @author :lujia
 * @date :2019/4/23  22:47
 */
public class XiaoMiFactory implements MobileFactory{
    @Override
    public Mobile createMobile() {
        return new XiaoMi();
    }
}
