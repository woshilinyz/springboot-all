package com.lin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Mr.Lin
 * @create: 2019-08-03 21:11:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id ;
    private String loginName ;
    private String username ;
    private String password;

}
