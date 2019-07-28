package com.linyz.connector;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 15:43:21
 **/
@Slf4j
public class CustomShutDown implements TomcatConnectorCustomizer,ApplicationListener<ContextClosedEvent> {
    private static final int TIMEOUT=30;
    private volatile Connector connector;
    @Override
    public void customize(Connector connector) {
        this.connector=connector;
    }

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        //暂停接受外部的请求
        this.connector.pause();
        //获取connector对应的线程池
        Executor executor = this.connector.getProtocolHandler().getExecutor();
        if(executor instanceof ThreadPoolExecutor){
            try {
                log.warn("准备关闭web应用");
                ThreadPoolExecutor threadPoolExecutor =(ThreadPoolExecutor)executor;
                //
                threadPoolExecutor.shutdown();
                if(!threadPoolExecutor.awaitTermination(TIMEOUT, TimeUnit.SECONDS)){
                    log.warn("web应用等待关闭超过最大时长"+TIMEOUT+"秒，将进行强制关闭");
                    threadPoolExecutor.shutdownNow();
                    if(!threadPoolExecutor.awaitTermination(TIMEOUT, TimeUnit.SECONDS)){
                        log.warn("web应用关闭失败");
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
