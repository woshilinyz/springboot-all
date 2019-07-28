package com.lin.handle;

import com.lin.utils.BeanTool;
import org.springframework.beans.BeanUtils;

import java.util.Map;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 17:17:33
 **/
public class HandlerContext {
    private Map<String,Class> map;
    public HandlerContext(Map<String, Class> handlerMap) {
        this.map=handlerMap;
    }
    public AbstractHandler getInstrance(String type){
        Class clazz = map.get(type);
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
