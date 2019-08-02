package com.lin.quartz;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 10:30:45
 **/
@Component
public class HelloJob {
    public void sayHello() {
        System.out.println("say hello from HelloJob:>>>"+new Date());
    }
}
