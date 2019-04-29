package lesson.patten.login;

/**
 * @author :lujia
 * @date :2019/4/29  15:49
 */
public class ThirdLoginService extends LoginServiceImpl {


    public void loginForQQ(String qqToken){
        System.out.println("qq登陆");
    }

    public void loginForPhone(String phoneNum){
        System.out.println("手机号登陆");
    }

}
