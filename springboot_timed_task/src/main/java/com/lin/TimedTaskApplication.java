package com.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 10:17:16
 **/
@SpringBootApplication
@EnableScheduling
public class TimedTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimedTaskApplication.class,args);
    }
}
