package com.lin.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.Lin
 * @create: 2019-08-11 10:45:17
 **/
@Component
public class LogRunner implements CommandLineRunner{
    Logger logger = LoggerFactory.getLogger(LogRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.trace("【LogRunner.class】trace level log input");
        logger.debug("【LogRunner.class】debug level log input");
        logger.info("【LogRunner.class】info level log input");
        logger.warn("【LogRunner.class】warn level log input");
        logger.error("【LogRunner.class】error level log input");
    }
}
