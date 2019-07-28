package com.lin.springboot.controller;

import com.lin.springboot.pojo.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Lin
 * @create: 2019-07-27 09:27:12
 **/
@RestController
public class HelloController {
    @PostMapping("/hello")
    public String hello(@RequestBody Hello hello){
        System.out.println(hello.getMsg());
        return  "hello";
    }
    @PostMapping("/hi")
    public String hi(Hello hello){
        System.out.println(hello.getMsg());
        return  "hello";
    }
}
