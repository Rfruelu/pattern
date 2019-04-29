package lesson.patten.login.v2;

/**
 * @author :lujia
 * @date :2019/4/29  15:56
 */
public interface LoginAdapter {

    boolean support(Object handler);

    String login(String id,Object handler);
}
