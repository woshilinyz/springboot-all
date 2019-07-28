package com.lin.anno;

import java.lang.annotation.*;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 16:59:59
 **/
@Documented
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HandlerType {
    String value();
}
