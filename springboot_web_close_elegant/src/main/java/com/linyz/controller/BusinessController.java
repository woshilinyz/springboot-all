package com.linyz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 16:00:05
 **/
@Controller
@Slf4j
public class BusinessController {
    @RequestMapping("/handle")
    @ResponseBody
    public String handle() throws InterruptedException {
      log.info("开始处理业务");
      Thread.sleep(10000);
      log.info("结束处理业务");
      return "end";
    }
}
