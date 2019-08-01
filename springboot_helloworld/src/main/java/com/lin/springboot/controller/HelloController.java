package com.lin.springboot.controller;

import com.lin.springboot.pojo.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Mr.Lin
 * @create: 2019-07-27 09:27:12
 **/
//@RestController
@Controller
public class HelloController {
   // @PostMapping("/hello")
    public String hello(@RequestBody Hello hello){
        System.out.println(hello.getMsg());
        return  "hello";
    }
    //@PostMapping("/hi")
    public String hi(Hello hello){
        System.out.println(hello.getMsg());
        return  "hello";
    }
    @RequestMapping("/view")
    public String view(ModelMap modelMap){
        modelMap.addAttribute("hello","hello");
        return "view";
    }
}
