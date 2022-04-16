package com.studentTest.selvlet;


import com.studentTest.bean.User;
import com.studentTest.service.FileService;
import com.studentTest.service.FileServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

/*
"upStu?admId=${admId}&stuId=${stuId}&a="+a+"&b="+b+"&c="+c+"&d="+d;
 */
@WebServlet("/upStu")
public class upPage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String admId=req.getParameter("admId");
        String stuId=req.getParameter("stuId");
        String a=req.getParameter("a");
        String b=req.getParameter("b");
        String c=req.getParameter("c");
        String d=req.getParameter("d");
        System.out.println(admId+" "+stuId+" "+a+" "+b+" "+c+" "+d);
        FileService fs=new FileServiceImpl();
        fs.upScore(stuId,a,b,c,d);
        /*
        修改数据,在这里返回前端界面
         */
        User user=fs.getAdmine(admId);
        ArrayList<User> arr=fs.getAllStudent();
        req.setAttribute("user",user);
        req.setAttribute("arr",arr);
        req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
    }
}
