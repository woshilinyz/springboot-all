package com.lin.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 21:27:06
 **/
@Data
public class Permission implements Serializable{
    private String id;
    private String name;
    private String url;
}
