package lesson.patten.login;

/**
 * @author :lujia
 * @date :2019/4/29  15:46
 */
public interface ILoginService {

    void register(String name,String password);

    void login(String name,String password);
}
