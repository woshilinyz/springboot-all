package com.lin.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-01 21:37:51
 **/
public class ImgResMail {
    @Autowired
    private JavaMailSender javaMailSender;

    public void imgResMail()throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("主题:这是一封测试邮件并且携带图片正文");
        helper.setFrom("529029157@qq.com");
        helper.setTo("529029157@qq.com");
        helper.setCc("xxxxxxxxx@qq.com");
        helper.setBcc("xxxxxxxxx@qq.com");
        helper.setSentDate(new Date());
        helper.setText("<p>hello 大家好，这封邮件包含两种图片，分别如下</p><p>第一张图片：</p><img src='cid:p01'/><p>第二张图片：</p><img src='cid:p02'/>",true);
        helper.addInline("p01",new FileSystemResource(new File("C:\\Users\\Administrator\\Desktop\\jpg\\1.jpg")));
        helper.addInline("p02",new FileSystemResource(new File("C:\\Users\\Administrator\\Desktop\\jpg\\2.jpg")));
        javaMailSender.send(mimeMessage);
    }
}
