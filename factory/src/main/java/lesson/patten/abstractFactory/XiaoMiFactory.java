package lesson.patten.abstractFactory;

import lesson.patten.Mobile;
import lesson.patten.Tv;
import lesson.patten.XiaoMiTv;
import lesson.patten.factoryMethod.XiaoMi;

/**
 * @author :lujia
 * @date :2019/4/23  23:02
 */
public class XiaoMiFactory implements Factory{
    @Override
    public Mobile createMobile() {
        return new XiaoMi();
    }

    @Override
    public Tv createTv() {
        return new XiaoMiTv();
    }
}
