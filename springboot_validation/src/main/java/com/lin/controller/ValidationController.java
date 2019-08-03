package com.lin.controller;

import com.lin.common.Result;
import com.lin.pojo.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-07-29 21:05:00
 **/
@RestController
@RequestMapping("/login")
@Validated
public class ValidationController {



    @PostMapping("/form")

    public Result test1(@NotBlank String name,
                         @Email String email) {
        //方法上的校验，类上加注解
        return Result.ok();
    }

    @PostMapping("/validateWithBindingResult")
    @ResponseBody
    public Result validateWithBindingResult(@Validated LoginForm loginForm, BindingResult bindingResult){
        List<String> errorMsg=new ArrayList<>();
        if (bindingResult.hasErrors()){
            for (ObjectError objectError:bindingResult.getAllErrors()) {
                errorMsg.add(objectError.getDefaultMessage());
            }
            return Result.error(errorMsg);
        }
       return Result.ok();
    }
    @PostMapping("/validateWithOutBindingResult")
    public Result validateWithOutBindingResult(@Valid LoginForm loginForm){
        List<String> errorMsg=new ArrayList<>();
        return Result.ok();
    }
}
