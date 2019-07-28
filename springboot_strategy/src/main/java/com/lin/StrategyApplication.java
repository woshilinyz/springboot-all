package com.lin;

import com.lin.dto.OrderDto;
import com.lin.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 16:49:52
 **/
@SpringBootApplication
public class StrategyApplication implements CommandLineRunner{

    @Autowired
    private IOrderService service;

    @Override
    public void run(String... args) throws Exception {
        OrderDto dto=new OrderDto("1");
        service.handler(dto);
    }

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class,args);
    }
}
