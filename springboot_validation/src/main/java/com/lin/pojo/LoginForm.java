package com.lin.pojo;

import com.lin.validation.PhoneValidation;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author: Mr.Lin
 * @create: 2019-07-29 21:00:55
 **/
@Data
public class LoginForm {

    @NotBlank(message = "用户名不能为空")
    @Email
    private String username;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6,message = "密码长度最少6位")
    private String password;

    @PhoneValidation
    private String phone;
}
