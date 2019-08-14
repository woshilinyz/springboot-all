package com.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Mr.Lin
 * @create: 2019-08-11 10:41:47
 **/
@SpringBootApplication
public class LogApplication {
    //MDC
    //MDC中的值在logback.xml文件中的pattern中用%X{key}来引用
    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class,args);
    }
}
