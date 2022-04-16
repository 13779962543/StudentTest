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
回主界面
 */
@WebServlet("/goMainPage")
public class GoMainPage  extends HttpServlet {
    /*
    管理员对象
    所有学生
     */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String admId=req.getParameter("admId");
        FileService fs=new FileServiceImpl();
        User user=fs.getAdmine(admId);
        ArrayList<User> arr=fs.getAllStudent();
        req.setAttribute("user",user);
        req.setAttribute("arr",arr);
        req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
    }
}
