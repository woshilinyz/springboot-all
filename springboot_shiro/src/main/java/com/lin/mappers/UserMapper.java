package com.lin.mappers;

import com.lin.pojo.User;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 21:28:19
 **/
public interface UserMapper {

    User findByName(String name);

    User findById(String id);
}
