package com.studentTest.selvlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/upTo")
public class ToUp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String admId=req.getParameter("admId");
        String stuId=req.getParameter("stuId");
        /*
        跳转到修改界面
        admId
         */
        req.setAttribute("admId",admId);
        req.setAttribute("stuId",stuId);
        req.getRequestDispatcher("upPage.jsp").forward(req,resp);
    }
}
