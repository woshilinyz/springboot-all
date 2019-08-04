package com.lin.runner;

import com.lin.dao.FooDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 15:20:38
 **/
@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private FooDao fooDao;
    @Override
    public void run(String... args) throws Exception {
        fooDao.insert();
    }
}
