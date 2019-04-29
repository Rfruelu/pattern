package lesson.patten.login;

/**
 * @author :lujia
 * @date :2019/4/29  15:47
 */
public class LoginServiceImpl implements ILoginService {
    @Override
    public void register(String name, String password) {
        System.out.println("账号+密码注册");
    }

    @Override
    public void login(String name, String password) {
        System.out.println("用户名+密码登陆");
    }
}
