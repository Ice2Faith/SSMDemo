package com.i2f.controller;

import com.google.gson.Gson;
import com.i2f.model.Role;
import com.i2f.service.IRoleService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通过注解来实现一个Controller，只需要给上注解
 * @Controller
 * 而且你还可以给定其命名空间
 * @RequestMapping("/sys")
 * 这个命名空间也就是url的一部分
 * url也就是这个命名空间拼接上方法的相同注解的值
 * 这样的话，就有了相同的前置url路径
 */
@Controller
@RequestMapping("/sys")
public class SysController {

    /**
     * 可以看到，使用注解之后不用实现Controller接口
     * 而且对于方法来说，并没有任何限制
     * 你可以将前端提交的数据作为函数的参数
     * 当前端提交参数名和函数的参数名一致时，可以直接映射进来
     * 当名字不一样时，只需要注解RequestParam即可实现映射
     * 注解RequestMapping不但可以指定访问的url,还可以指定提交的方式等，比如下面的
     * 如果没有规定提交方式，将接受所有方式
     * 关于返回值，如果你需要携带数据进行跳转，那么就是ModelAndView
     * 如果不携带数据，直接进行跳转，返回值为String即可，也就是要跳转的url
     * @param name
     * @param desc
     * @param state
     * @return
     */
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public ModelAndView addRole(@RequestParam("rolename") String name,
                                @RequestParam("roledesc") String desc,
                                @RequestParam(value = "rolestate",required = false,defaultValue = "1")
                                int state){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("desc",desc);
        mv.addObject("state",state);

        mv.setViewName("respAddRole");

        return mv;
    }

    /**
     * 在SSM框架中，Spring提供了注入机制
     * 因此并不需要我们new出对象，Spring会帮我们自动创建对象
     * 如果服务的接口只有一个实现类，那么使用两个注解之一都行：
     * @Resource
     * @Autowired
     * 如果有多个实现类，那么就要指定要使用哪一个实现类
     * 使用组合注解：
     * @Autowired
     * @Qualifier("服务的Service注解值")
     * 服务的注解例如：
     * @Service("roleService")
     */
    @Autowired
    @Qualifier("roleService")
    private IRoleService roleService;

    @RequestMapping(value = "/allRole",method = RequestMethod.POST)
    public ModelAndView queryAllRole(){
        ModelAndView mv=new ModelAndView();
        List<Role> list=roleService.getAll();
        Gson gson=new Gson();
        String rjs=gson.toJson(list);
        mv.addObject("roles",rjs);
        mv.setViewName("displayRoles");
        return mv;
    }
}
