package com.lin.dao;

import com.lin.pojo.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 15:19:47
 **/
@Repository
@Slf4j
public class FooDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        Arrays.asList("apple","orange")
                .forEach(s ->jdbcTemplate.update("insert into Foo(Bar) values(?)",s) );
        List<Foo> fooList = jdbcTemplate.query("select * from Foo", BeanPropertyRowMapper.newInstance(Foo.class));
        fooList.forEach(foo ->System.out.println(foo.toString()) );
    }
}
