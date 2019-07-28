package com.lin.handle;

import com.lin.dto.OrderDto;
import org.springframework.core.annotation.Order;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 16:56:45
 **/
public abstract class AbstractHandler {
    abstract public String handle(OrderDto orderDto);
}
