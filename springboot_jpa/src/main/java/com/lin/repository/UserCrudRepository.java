package com.lin.repository;

import com.lin.pojo.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 09:36:05
 **/
public interface UserCrudRepository  extends CrudRepository<User,Integer> {
}
