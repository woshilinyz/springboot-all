package com.lin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 21:26:10
 **/
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private String password;
    private Set<Role> roles = new HashSet<>();
}
