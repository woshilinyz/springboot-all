package com.lin.controller;

import com.lin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 16:02:10
 **/
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User u = new User();
            u.setId((long) i);
            u.setName("lin:" + i);
            u.setAddress("广州:" + i);
            users.add(u);
        }
        model.addAttribute("users", users);
        return "index";
    }


}
