package lesson.patten.login;

import lesson.patten.login.ThirdLoginService;
import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/29  15:52
 */
public class LoginTest {

    @Test
    public void test(){
        ThirdLoginService thirdLoginService=new ThirdLoginService();
        thirdLoginService.login("123","123");
        thirdLoginService.loginForQQ("123");
        thirdLoginService.loginForPhone("15956423542");

    }
}
