package com.lin.scheduled;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: Mr.Lin
 * @create: 2019-08-02 10:18:10
 **/
@Component
public class ScheduledTask {

    //fixedRate 表示任务执行之间的时间间隔，具体是指两次任务的开始时间间隔
    // 即第二次任务开始时，第一次任务可能还没结束。
    //milliseconds
    @Scheduled(fixedRate= 2000)
    public void fixedRate(){
        System.out.println("2s 输出一次-->  "+new Date());
    }
    //fixedDelay 表示任务执行之间的时间间隔
    // 具体是指本次任务结束到下次任务开始之间的时间间隔。
    //milliseconds
    @Scheduled(fixedDelay= 3000)
    public void fixedDelay(){
        System.out.println("3s 输出一次-->  "+new Date());
    }
    //initialDelay 表示首次任务启动的延迟时间
    @Scheduled(initialDelay =5000,fixedRate= 5000)
    public void initialDelay(){
        System.out.println("5s后启动，5s 输出一次-->  "+new Date());
    }
}
