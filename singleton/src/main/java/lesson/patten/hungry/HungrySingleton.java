package lesson.patten.hungry;

import java.io.Serializable;

/**
 * 饿汉单列模式
 * 缺点：1.在类加载阶段就分配空间进行初始化操作，浪费资源
 *      2.对象在序列化之后，破坏单例
 * @author :lujia
 * @date :2019/4/23  23:36
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton=new HungrySingleton();
    private static final long serialVersionUID = 6557707547858468529L;

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
