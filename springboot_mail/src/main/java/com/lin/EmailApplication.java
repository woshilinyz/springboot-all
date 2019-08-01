package com.lin;

import com.lin.email.AttachFileMail;
import com.lin.email.SimpleEmail;
import com.lin.email.ThymeleafMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Mr.Lin
 * @create: 2019-08-01 21:30:01
 **/
@SpringBootApplication
public class EmailApplication implements CommandLineRunner{

    @Autowired
    private ThymeleafMail thymeleafMail;

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        thymeleafMail.thymeleafMail();
    }
}
