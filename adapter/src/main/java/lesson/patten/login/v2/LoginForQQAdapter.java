package lesson.patten.login.v2;

/**
 * @author :lujia
 * @date :2019/4/29  15:57
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginForQQHandler;
    }

    @Override
    public String login(String id, Object object) {
        return ((LoginForQQHandler)object).login(id);
    }
}
