package com.lin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.lin.pojo.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author linyz
 * @since 2019-08-03
 */
public interface UserService extends IService<User> {
    Page<User> selectByPage(User user, int page, int pageSize);

    User selectOne(User user);
}
