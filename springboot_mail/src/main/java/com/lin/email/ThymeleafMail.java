package com.lin.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-01 21:50:13
 **/
@Component
public class ThymeleafMail {
    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private JavaMailSender javaMailSender;

    public void thymeleafMail() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("主题:这是一封邮件，来自thymeleaf模板");
        helper.setFrom("529029157@qq.com");
        helper.setTo("529029157@qq.com");
        //helper.setCc("37xxxxx37@qq.com");
        //helper.setBcc("14xxxxx098@qq.com");
        helper.setSentDate(new Date());
        Context context = new Context();
        context.setVariable("username", "lin");
        context.setVariable("num","10086");
        context.setVariable("salary", "99999");
        String process = templateEngine.process("mail.html", context);
        helper.setText(process,true);
        javaMailSender.send(mimeMessage);
    }


}
