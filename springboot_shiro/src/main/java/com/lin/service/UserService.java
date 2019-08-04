package com.lin.service;

import com.lin.pojo.User;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 21:29:14
 **/
public interface UserService {

    User findByName(String name);
}