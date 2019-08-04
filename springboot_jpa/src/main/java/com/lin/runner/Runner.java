package com.lin.runner;

import com.lin.pojo.User;
import com.lin.repository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 09:43:12
 **/
@Component
public class Runner implements CommandLineRunner{

    @Autowired
    private UserCrudRepository crudRepository;
    @Override
    public void run(String... args) throws Exception {
        Iterable<User> users = crudRepository.findAll();
        users.forEach(u->System.out.println(u.toString()));
    }
}
