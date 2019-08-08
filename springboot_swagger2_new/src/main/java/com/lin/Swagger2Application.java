package com.lin;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Mr.Lin
 * @create: 2019-08-08 20:48:02
 **/
@SpringBootApplication
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Application {
    //localhost:8080/doc.html
    public static void main(String[] args) {
        SpringApplication.run(Swagger2Application.class,args);
    }
}
