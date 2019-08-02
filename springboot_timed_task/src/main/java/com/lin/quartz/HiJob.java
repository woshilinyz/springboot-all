package com.lin.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 10:30:45
 **/
@Component
public class HiJob extends QuartzJobBean {
    private HiService hiService;
    public void sayHi() {
        System.out.println("say hi from HiJob:>>>"+new Date());
    }
    public HiService getHelloService() {
        return hiService;
    }

    public void setHelloService(HiService hiService) {
        this.hiService = hiService;
    }
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        this.sayHi();
    }
}
