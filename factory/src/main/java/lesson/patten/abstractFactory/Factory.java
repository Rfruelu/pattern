package lesson.patten.abstractFactory;

import lesson.patten.Mobile;
import lesson.patten.Tv;

/**
 * 抽象工厂（一个大工厂可以生产各种设备）
 * @author :lujia
 * @date :2019/4/23  22:58
 */
public interface Factory {

    Mobile createMobile();

    Tv createTv();
}
