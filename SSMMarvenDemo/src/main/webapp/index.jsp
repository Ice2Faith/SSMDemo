<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/10/24
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Init Page</title>
</head>
<body>
Init Page
<hr/>
    <form method="post" action="/sys/allRole">
        <input type="submit" value="查询SSM集成测试所有角色测试"/>
    </form>
    <form method="post" action="/hello.do">
        <input type="submit" value="单纯mvc功能性测试"/>
    </form>

    <input type="button" value="mvc参数传递页面跳转测试" onclick="location.href='html/reqAddRole.jsp'"/>

</body>
</html>
