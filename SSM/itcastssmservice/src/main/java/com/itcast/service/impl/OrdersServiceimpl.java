package com.itcast.service.impl;

import com.github.pagehelper.PageHelper;
import com.itcast.dao.OrdersMapper;
import com.itcast.pojo.Orders;
import com.itcast.service.IOrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")
public class OrdersServiceimpl implements IOrdersService{
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findAllOrders(Integer page, Integer pageSize) throws Exception {
        PageHelper.startPage(page, pageSize);
        return ordersMapper.findAllOrders();
    }
}
