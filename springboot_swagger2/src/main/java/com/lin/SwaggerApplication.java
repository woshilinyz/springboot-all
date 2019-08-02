package com.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 15:07:28
 **/
@SpringBootApplication
public class SwaggerApplication {
    //http://localhost:8080/swagger-ui.html
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class,args);
    }
}
