package lesson.patten.login.v2;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/29  16:04
 */
public class LoginTest {

    @Test
    public void test(){
        ThirdLoginAdapter thirdLoginAdapter=new ThirdLoginAdapter();
        thirdLoginAdapter.login("123","123");

        thirdLoginAdapter.loginForPhone("token");
        thirdLoginAdapter.loginForQQ("qq");

    }
}
