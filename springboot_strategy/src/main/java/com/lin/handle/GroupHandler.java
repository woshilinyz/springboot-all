package com.lin.handle;

import com.lin.anno.HandlerType;
import com.lin.dto.OrderDto;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 16:57:44
 **/
@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {
    @Override
    public String handle(OrderDto orderDto) {
        return "处理团购订单";
    }
}
