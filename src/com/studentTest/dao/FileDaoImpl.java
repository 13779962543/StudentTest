package com.studentTest.dao;

import com.studentTest.bean.User;
import com.studentTest.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FileDaoImpl implements FileDao{
    /*
    获取所有的信息
     */
    @Override
    public ArrayList<User> getAllStudent() {
        ArrayList<User> arr=new ArrayList<>();
        Connection connection= ConnectionFactory.getConnection();
        PreparedStatement pre=null;
        ResultSet res=null;
        //准备sql语句
        String sql="SELECT*FROM studenttest.u_user WHERE u_role=1 AND u_isdelte=0";
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
                arr.add(user);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return arr;

    }
}
