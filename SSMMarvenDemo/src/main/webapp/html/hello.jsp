<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2020/10/24
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Mvc</title>
</head>
<body>
    <!-- 这种形式也就是EL表达式，这里也就是使用EL表达式取了一个值，这个值和
     ModelAndView mv=new ModelAndView();
        mv.addObject("hello","welcome to spring mvc");
        这里的（Controller）addObject是键值的关系
     -->
    ${hello}


</body>
</html>
