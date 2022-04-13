package com.studentTest.dao;

import com.studentTest.bean.User;
import com.studentTest.util.ConnectionFactory;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao{
    @Override
    public User logindao(User u) {

        int id=u.getU_id();
        String pwd=u.getU_pwd();
        //写数据库的东西
        //获取连接对象->准备需要的sql语句->把sql语句放在preareStatement=connection
        //执行

        Connection connection= ConnectionFactory.getConnection();
        PreparedStatement pre=null;
        ResultSet res=null;
        //准备sql语句
        String sql="SELECT*FROM studenttest.u_user WHERE u_id="+id+" AND u_pwd='"+pwd+"'";
        try{
            pre=connection.prepareStatement(sql);
            res=pre.executeQuery();

            while(res.next()){
                User user=new User();
                user.setU_id(res.getInt("u_id"));
                user.setU_name(res.getString("u_name"));

                user.setU_pwd(res.getString("u_pwd"));
                user.setU_phone(res.getString("u_phone"));
                user.setRole(res.getInt("u_role"));
                user.setIsdelte(res.getInt("u_isdelte"));
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}
