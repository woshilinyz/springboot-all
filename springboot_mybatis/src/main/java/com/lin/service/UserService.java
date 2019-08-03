package com.lin.service;

import com.lin.dao.UserMapper;
import com.lin.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-08-03 21:14:09
 **/
@Service
public class UserService {
    // 注入UserRepository
    @Resource
    private UserMapper userMapper;

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public User selectByUsername(String username){
        return userMapper.selectByUsername(username);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public void insertGetKey(User user) {
        // 数据插入成功以后，Mybatis框架会将插入成功的数据主键存入到user对象中去
        userMapper.insertGetKey(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void delete(Integer id) {
        userMapper.delete(id);
    }

    public User findById(Integer id) {
        return userMapper.selectById(id);
    }
}
