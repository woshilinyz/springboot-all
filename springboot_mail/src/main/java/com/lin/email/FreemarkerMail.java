package com.lin.email;

import com.lin.pojo.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.StringWriter;
import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-01 21:41:07
 **/
public class FreemarkerMail {
    @Autowired
    private JavaMailSender javaMailSender;

    public void  freemarkerMail()throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("主题:这是一封邮件，来自freemarker模板");
        helper.setFrom("529029157@qq.com");
        helper.setTo("529029157@qq.com");
        helper.setCc("xxxxxxxxx@qq.com");
        helper.setBcc("xxxxxxxxx@qq.com");
        helper.setSentDate(new Date());
        //构建 Freemarker 的基本配置
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_0);
        // 配置模板位置
        ClassLoader loader = FreemarkerMail.class.getClassLoader();
        configuration.setClassLoaderForTemplateLoading(loader, "templates");
        //加载模板
        Template template = configuration.getTemplate("mail.ftl");
        User user = new User();
        user.setUsername("lin");
        user.setNum(1);
        user.setSalary((double) 10086);
        StringWriter out = new StringWriter();
        //模板渲染，渲染的结果将被保存到 out 中 ，将out 中的 html 字符串发送即可
        template.process(user, out);
        helper.setText(out.toString(),true);
        javaMailSender.send(mimeMessage);
    }
}
