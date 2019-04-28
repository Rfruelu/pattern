package lesson.patten.enumSingleton;

/**
 * 枚举单例，不存在线程安全，和浪费资源问题
 * 高效java推荐使用
 * @author :lujia
 * @date :2019/4/28  13:55
 */
public enum  EnumSingleton {


    ONE;
    private void say(String message){
        System.out.println(message);
    }


}
