package com.lin.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-01 21:35:57
 **/
@Component
public class AttachFileMail {
    @Autowired
    private JavaMailSender javaMailSender;

    public void attachFileMail()throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setSubject("主题:这是一封测试邮件并且携带附件");
        helper.setFrom("529029157@qq.com");
        helper.setTo("529029157@qq.com");
       // helper.setCc("37xxxxx37@qq.com");
       // helper.setBcc("14xxxxx098@qq.com");
        helper.setSentDate(new Date());
        helper.setText("这是正文");
        helper.addAttachment("2.jpg",new File("C:\\Users\\Administrator\\Desktop\\jpg\\2.jpg"));
        javaMailSender.send(mimeMessage);


    }
}
