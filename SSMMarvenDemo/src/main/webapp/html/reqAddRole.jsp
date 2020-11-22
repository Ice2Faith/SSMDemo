<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/10/24
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加角色请求测试</title>
</head>
    <body>
    <h3>添加角色请求测试</h3>
    <hr/>
    <form method="post" action="/sys/addRole" name="addRoleForm">
        角色名称：<input type="text" name="rolename" placeholder="请输入角色名称"><br/>
        角色描述：<input type="text" name="roledesc" placeholder="请输入角色描述"><br/>
        角色状态：<input type="text" name="rolestate" placeholder="请输入角色状态"><br/>
        <input type="submit" value="添加">
    </form>
</body>
</html>
