package lesson.patten.lazy;

/**
 * 懒汉单例模式
 * 缺点：多线程情况下，存在破坏单例的情况
 * @author :lujia
 * @date :2019/4/23  23:42
 */
public class LazySingleton {


    private static LazySingleton lazySingleton;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
