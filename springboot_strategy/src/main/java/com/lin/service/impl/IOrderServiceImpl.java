package com.lin.service.impl;

import com.lin.dto.OrderDto;
import com.lin.handle.AbstractHandler;
import com.lin.handle.HandlerContext;
import com.lin.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 16:53:40
 **/
@Service
public class IOrderServiceImpl implements IOrderService {
    @Override
    public String handle(OrderDto orderDto) {
        String type=orderDto.getType();
        if("1".equals(type)){
            return "处理普通订单";
        }else if("2".equals(type)){
            return "处理团购订单";
        }else {
            return "处理促销订单";
        }
    }

    @Autowired
    private HandlerContext context;
    @Override
    public String handler(OrderDto orderDto){
        AbstractHandler instrance = context.getInstrance(orderDto.getType());
        return instrance.handle(orderDto);
    }
}
