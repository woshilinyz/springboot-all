package com.lin.cxf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Mr.Lin
 * @create: 2019-08-14 09:13:51
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -3628469724795296287L;

    private String userId;
    private String userName;
    private String email;

}
