package chencheng.bwie.com.chencheng20180424.view;

import chencheng.bwie.com.chencheng20180424.bean.LogBean;
import chencheng.bwie.com.chencheng20180424.bean.RegBean;
import chencheng.bwie.com.chencheng20180424.bean.UserBean;

/**
 * Created by dell on 2018/4/24.
 */

public interface MyView {
    //登录页面由presenter层交互数据到view层MainActivity
    public interface LoginView{
        //登录时，数据获取成功的方法，返回一个值表示登陆成功
        void success(LogBean loginBean);
        //登录时，数据获取失败的方法，返回一个int值响应码表示登陆失败
        void failed(int code);
    }

    //注册页面由presenter层到view层RegActivity
    public interface RegView{

        void failed(int code);
        void sucess(RegBean regBean);
    }

    //个人页面由presenter层到view层RegActivity
    public interface PersonView{
        void failed(int code);
        void sucess(UserBean personInfoBean);
    }
}
