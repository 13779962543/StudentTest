<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2022/4/16
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改界面</title>
</head>
<style>
    #a{
        width:70%;
        height:600px;
        background-color: lemonchiffon;
        margin-left: 50px;
        position: absolute;
    }
    #b{
        margin-left: 300px;
        margin-top: 100px;
    }
    input{
        margin-top:15px ;
        margin-left: 70px;
        font-size: 30px;
        color: red;
        font-family: 华文新魏;
    }
    button{
        background-color: azure;
        width: 100px;
        height: 25px;
        font-family: 华文新魏;
        margin-left: 110px;
    }
    span{
        margin-left: 100px;
        color: red;
    }

</style>
<script>
    function goMainPage(){
        window.location.href="goMainPage?admId=${admId}"
    }
    function sureUp(){
        /*
        访问服务器要拿的参数
        1.管理员id 1 admId
        2.处理对象:学生 stuId
        3.输入的成绩 a,b,c,d
         */
        let a=document.getElementById("a1").value;
        let b=document.getElementById("a2").value;
        let c=document.getElementById("a3").value;
        let d=document.getElementById("a4").value;
        window.location.href="upStu?admId=${admId}&stuId=${stuId}&a="+a+"&b="+b+"&c="+c+"&d="+d;
    }
</script>
<body>
<div id="a">
<%--
    admId stuId
--%>
    <div style="font-size:40px;margin-top: 40px;margin-left: 70px;">成绩修改界面</div>
    <span>学生:&nbsp;${stuId}</span><br>
    <span>管理员:&nbsp;${admId}</span>
    <div id="b">
        计算机网:&nbsp;&nbsp;<input type="text" id="a1"><br>
        <br>
        软件工程:&nbsp;&nbsp;<input type="text" id="a2"><br>
        <br>
        软件测试:&nbsp;&nbsp;<input type="text" id="a3"><br>
        <br>
        机器学习:&nbsp;&nbsp;<input type="text" id="a4"><br>
        <br>
        <button onclick="goMainPage()">回主界面</button>&nbsp;&nbsp;
        <button onclick="sureUp()">确认修改</button>
    </div>
</div>
</body>
</html>
