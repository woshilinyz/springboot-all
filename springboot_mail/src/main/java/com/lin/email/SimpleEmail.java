package com.lin.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-01 21:31:46
 **/
@Component
public class SimpleEmail {
    @Autowired
    private JavaMailSender sender;

    public void sendSimple(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("这是一封测试邮件:SimpleEmail");
        message.setFrom("529029157@qq.com");
        //设置邮件接收者，可以有多个接收者
        message.setTo("529029157@qq.com");
        //设置邮件抄送人，可以有多个抄送人
      //  message.setCc("37xxxxx37@qq.com");
        //设置隐秘抄送人，可以有多个
      //  message.setBcc("14xxxxx098@qq.com");
        message.setSentDate(new Date());
        message.setText("这是测试邮件的正文");
        sender.send(message);
    }
}
