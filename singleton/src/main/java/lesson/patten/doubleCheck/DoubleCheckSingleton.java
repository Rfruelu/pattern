package lesson.patten.doubleCheck;

/**
 * @author :lujia
 * @date :2019/4/24  0:03
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){

    }

    /**
     * 加锁，
     * 静态方法加锁，锁对象是class对象
     * @return
     */
    public static synchronized DoubleCheckSingleton getInstance(){
        if (null==doubleCheckSingleton){
            doubleCheckSingleton=new DoubleCheckSingleton();

        }
        return doubleCheckSingleton;
    }

    /**
     * 双重校验锁
     * @return
     */
    public static  DoubleCheckSingleton getInstanceDoubleCheck(){
        if (null==doubleCheckSingleton){
            synchronized (DoubleCheckSingleton.class){
                if (null==doubleCheckSingleton){

                    doubleCheckSingleton=new DoubleCheckSingleton();
                }
            }

        }
        return doubleCheckSingleton;
    }

}
