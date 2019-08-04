package com.lin.controller;

import com.lin.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 17:09:18
 **/
@Controller
public class UserController {

    @RequestMapping("/user/index")
    public String add(HttpServletRequest request){
        User bean = (User) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute("userName", bean.getName());
        return "/user/index";
    }

    @RequestMapping("/vip/index")
    public String update(){
        return "/vip/index";
    }
}
