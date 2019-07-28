package com.lin.processor;

import com.lin.anno.HandlerType;
import com.lin.handle.HandlerContext;
import com.lin.utils.ClassScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 17:02:24
 **/
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE="com/lin/handle";
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String,Class> handlerMap=new HashMap<>(3);
        try {
            ClassScanner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz->{
                HandlerType annotation = (HandlerType)clazz.getAnnotation(HandlerType.class);
                handlerMap.put(annotation.value(),clazz);
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        HandlerContext handlerContext=new HandlerContext(handlerMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(),handlerContext);
    }
}
