package com.lin;


import com.lin.log.LoggerBuilder;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Mr.Lin
 * @create: 2019-08-11 15:13:02
 **/

public class LogApplication {

    public static void main(String[] args) {
        LoggerBuilder loggerBuilder =new LoggerBuilder();
        Logger logger = loggerBuilder.getLogger("test");
        logger.debug("lin +++++++++++++++++++++++++++++++++++++debug");
        logger.warn("lin +++++++++++++++++++++++++++++++++++++warn");
        logger.info("lin +++++++++++++++++++++++++++++++++++++info");
        logger.error("lin +++++++++++++++++++++++++++++++++++++error");
    }
}
