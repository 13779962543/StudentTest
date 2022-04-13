package com.studentTest.util;

import com.studentTest.bean.User;
import com.studentTest.dao.LoginDaoImpl;

public class Test {
    public static void main(String[] args) {
        int id=1002;
        String pwd="a2";
        User u=new User();
        u.setU_id(id);
        u.setU_pwd(pwd);
        LoginDaoImpl l=new LoginDaoImpl();
        User retUse=l.logindao(u);
        if(retUse!=null){
            /*
            如果不为空，说明账户和密码一致
             */
            System.out.println("账号密码一致");
        }else{
            System.out.println("账号密码不一致");
        }

    }
}
