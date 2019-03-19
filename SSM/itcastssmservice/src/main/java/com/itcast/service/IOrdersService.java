package com.itcast.service;

import com.itcast.pojo.Orders;

import java.util.List;

public interface IOrdersService {
    /**
     * 查询所有订单
     * @return
     * @throws Exception
     */
    public List<Orders> findAllOrders(Integer page,Integer pageSize)throws Exception;
}
