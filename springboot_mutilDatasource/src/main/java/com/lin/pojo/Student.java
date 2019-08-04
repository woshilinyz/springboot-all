package com.lin.pojo;

import lombok.Data;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 21:21:14
 **/
@Data
public class Student {
    /** 学生编号*/
    private Long id;
    /** 学生姓名*/
    private String name;
    /** 学生年龄*/
    private Integer age;
}
