<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2022/4/10
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>

<%--
    在这里写js代码，对数据进行验证：
    用户id是否为空
        先去那标签的值，判断是否为空

        为空的时候
            就返回，并且设置一个提示,用户id为空
    密码为空
        先去那标签里面的值，判断是否为空

        为空的时候
            就返回，并来一个提示操作：密码不能为空
--%>
    <script>

    </script>
</head>
<body>
<div style="text-align:center">
    <form action="/login" method="post" id="loginForm">
        用户:<input type="text" name="uname" id="u_id"> <br>
        密码:<input type="password" name="upwd" id="u_pwd"> <br>
        <span id="span" style="font-size:12px;color:red">${error}</span><br>
        <button type="button" id="btn1">登录</button>
        <button type="button" id="btn2">重置</button>
        <script>
            let btn1=document.getElementById("btn1");
            btn1.onclick=function(){
                let id_str=document.getElementById("u_id").value;
                if(id_str==null||id_str==""){
                    document.getElementById("span").innerHTML="账户不能为空";
                    return;
                }
                let pwd_str=document.getElementById("u_pwd").value;
                if(pwd_str==null||pwd_str==""){
                    document.getElementById("span").innerHTML="密码不能为空";
                    return;
                }
                //开始访问服务器
                window.location.href="login?u_id="+id_str+"&u_pwd="+pwd_str;
            }
        </script>
    </form>
</div>
</body>
</html>
