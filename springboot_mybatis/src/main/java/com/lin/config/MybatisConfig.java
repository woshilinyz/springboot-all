package com.lin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.Lin
 * @create: 2019-08-03 21:12:00
 **/
@Configuration
@MapperScan("com.lin.dao")
public class MybatisConfig {
}
