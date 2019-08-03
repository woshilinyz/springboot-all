package com.lin.controller;

import com.github.pagehelper.PageHelper;
import com.lin.pojo.User;
import com.lin.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-08-03 21:15:13
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/insertUser")
    public String insertUser(User user){
        return "插入数据["+userService.insertUser(user)+"]条";
    }

    @RequestMapping("/insertGetKey")
    public User insertGetKey(User user) {
        userService.insertGetKey(user);
        return user ;
    }

    @RequestMapping("/selectByUsername")
    public User selectByUsername(String username){
        return userService.selectByUsername(username);
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        PageHelper.startPage(1,2);
        return userService.findAll();
    }

    @RequestMapping("/update")
    public void update(User user) {
        userService.update(user);
    }

    @RequestMapping("/delete")
    public void delete(Integer id) {
        userService.delete(id);
    }

    @RequestMapping("/find/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }
}
