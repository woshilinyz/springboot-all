package com.lin.controller;

import com.lin.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 15:18:02
 **/
@RestController
@Api(value = "用户类控制器",tags="用户类控制器")
@RequestMapping("/user")
public class ApiController {

    @ApiOperation(value ="查询用户",notes ="根据id查询用户" )
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99")
    @GetMapping("/")
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @ApiOperation("根据id更新用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99"),
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "lin")
    })
    @PutMapping("/")
    public User updateUsernameById(String username, Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }

    @PostMapping("/")
    @ApiOperation("添加用户")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id 删除用户")
    public void deleteUserById(@PathVariable Long id) {

    }


}
