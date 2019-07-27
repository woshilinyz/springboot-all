package com.lin.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Lin
 * @create: 2019-07-27 09:27:12
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return  "hello";
    }
}
