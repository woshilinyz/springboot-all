package com.lin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 15:27:50
 **/
@Data
@ApiModel
public class User {

    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("用户地址")
    private String address;
}
