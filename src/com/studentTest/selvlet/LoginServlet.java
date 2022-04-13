package com.studentTest.selvlet;
import com.studentTest.bean.User;
import com.studentTest.service.FileService;
import com.studentTest.service.FileServiceImpl;
import com.studentTest.service.loginService;
import com.studentTest.service.loginServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

/*
    这个注解就是我们起的名字，为了让前端的页面来访问
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_id=req.getParameter("u_id");
        String u_pwd=req.getParameter("u_pwd");
        User u=new User();
        u.setU_id(Integer.valueOf(u_id));
        u.setU_pwd(u_pwd);
        //多态
        //实现登录服务层的业务逻辑
        loginService l=new loginServiceImpl();
        User user=l.loginService(u);
//      如果user返回为空，这说明账号和密码不一致
//       如果不为空，账号密码一致，这就跳转到主页面
        if(user!=null){
            /*
            获取arr对象
             */
            FileService fs=new FileServiceImpl();
            ArrayList<User> arr=fs.getAllStudent();

            req.setAttribute("user",user);
            req.setAttribute("arr",arr);
            req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
        }else{
            req.setAttribute("error","账户或密码错误");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }


        System.out.println("账户:"+u.getU_id()+"密码:"+u.getU_pwd());


    }
}
