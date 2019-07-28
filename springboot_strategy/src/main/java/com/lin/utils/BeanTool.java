package com.lin.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 17:21:53
 **/
@Component
public class BeanTool implements ApplicationContextAware{
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
    public static Object getBean(Class clazz){
        return applicationContext.getBean(clazz);
    }
}
