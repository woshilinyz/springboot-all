package com.lin.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.lin.pojo.User;
import com.lin.mapper.UserMapper;
import com.lin.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linyz
 * @since 2019-08-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Page<User> selectByPage(User user, int page, int pageSize) {
        Page<User> p=new Page<>(page,pageSize);
        EntityWrapper wrapper=new EntityWrapper(user);
        wrapper.like("login_name","s");
        p.setRecords(  userMapper.selectPage(p,wrapper));
        return p;
    }

    @Override
    public User selectOne(User user) {
        return userMapper.selectOne(user);
    }
}
