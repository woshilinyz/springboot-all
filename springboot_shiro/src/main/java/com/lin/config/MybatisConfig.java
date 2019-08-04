package com.lin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 21:48:41
 **/
@Configuration
@MapperScan("com.lin.mappers")
public class MybatisConfig {
}
