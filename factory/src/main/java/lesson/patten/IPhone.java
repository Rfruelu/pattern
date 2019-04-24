package lesson.patten;

/**
 * @author :lujia
 * @date :2019/4/23  22:19
 */
public class IPhone implements Mobile {
    @Override
    public String call(String message) {
        return "IPhone call "+message;
    }
}
