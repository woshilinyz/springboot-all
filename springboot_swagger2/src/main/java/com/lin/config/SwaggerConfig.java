package com.lin.config;

import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 15:08:46
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lin.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(
                       new ApiInfoBuilder()
                        .title("SpringBoot整合Swagger").description("SpringBoot整合Swagger，详细信息......")
                        .version("9.0")
                        //.contact(new Contact("啊啊啊啊","blog.csdn.net","aaa@gmail.com"))
                        .license("The Apache License")
                        .licenseUrl("http://www.baidu.com")
                        .build()
                );
    }
 //   整合Security后添加一下配置
//    public void configure(WebSecurity web) throws Exception {
//            web.ignoring()
//                    .antMatchers("/swagger-ui.html")
//                    .antMatchers("/v2/**")
//                    .antMatchers("/swagger-resources/**");
//    }
}
