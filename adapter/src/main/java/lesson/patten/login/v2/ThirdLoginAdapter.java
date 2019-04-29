package lesson.patten.login.v2;

import lesson.patten.login.LoginServiceImpl;

/**
 * @author :lujia
 * @date :2019/4/29  15:59
 */
public class ThirdLoginAdapter extends LoginServiceImpl implements ThirdLogin {

    private String processLogin(String token,LoginAdapter loginAdapter,Object object){
        if (loginAdapter.support(object)){
            return loginAdapter.login(token,object);
        }else {
            System.out.println("不支持的登陆方式");
        }
        return null;
    }
    @Override
    public String loginForQQ(String token) {
        return processLogin(token,new LoginForQQAdapter(),new LoginForQQHandler());
    }

    @Override
    public String loginForPhone(String token) {
        return processLogin(token,new LoginForQQAdapter(),new LoginForPhoneHandler());
    }
}
