package com.lin.pojo;

import lombok.Data;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 21:22:02
 **/
@Data
public class User {
    /** 编号*/
    private Long id;
    /** 姓名*/
    private String name;
    /** 年龄*/
    private Integer age;
}
