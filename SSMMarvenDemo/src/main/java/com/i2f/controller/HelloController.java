package com.i2f.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 这是不使用注解的方式创建一个Controller，
 * 可以看出方法比较死，必须实现
 * 并且需要在spring-mvc.xml中配置一个bean来映射url
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        //设置一个键值，前端可以用EL表达式获取这个键的值
        mv.addObject("hello","welcome to spring mvc");
        //设置要跳转的目标页面，我们已经在spring-mvl.xml中配置了视图解析器
        //指明了前缀为/html/
        //后缀为.jsp
        //因此这里这样就完成了跳转到页面：/html/hello.jsp的任务
        mv.setViewName("hello");
        return mv;
    }
}
