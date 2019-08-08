package com.lin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 15:27:50
 **/
@Data
@ApiModel(value="user对象",description="用户对象user")
public class User {

    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty(value="用户名",required = true,dataType = "String")
    private String username;
    @ApiModelProperty("用户地址")
    private String address;
}
