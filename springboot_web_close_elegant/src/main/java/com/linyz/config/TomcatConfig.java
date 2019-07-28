package com.linyz.config;

import com.linyz.connector.CustomShutDown;
import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 15:54:20
 **/
@Configuration
public class TomcatConfig {

    @Bean
    public CustomShutDown customShutDown(){
        return new CustomShutDown();
    }
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(final CustomShutDown customShutDown){
        TomcatServletWebServerFactory tomcatServletWebServerFactory=new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.addConnectorCustomizers(customShutDown);
        return tomcatServletWebServerFactory;
    }
}
