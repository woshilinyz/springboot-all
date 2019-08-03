package com.lin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.lin.pojo.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author linyz
 * @since 2019-08-03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/find/{id}")
    public User getById(@PathVariable("id")Integer id){
        User user=new User();
        user.setId(id);
        return  userService.selectOne(user);
    }
    @RequestMapping("/selectByPage")
    public List<User> selectByPage(){
        User user=new User();
        Page<User> userPage = userService.selectByPage(user, 1, 2);
        return userPage.getRecords();
    }

    @RequestMapping("/selectByPageHelper")
    public List<User> selectByPageHelper(){
        PageHelper.startPage(1,2);
        List<User> userList= userService.selectList(new EntityWrapper<User>());
        return userList;
    }
}

