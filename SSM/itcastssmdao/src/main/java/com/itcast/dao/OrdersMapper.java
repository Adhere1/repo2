package com.itcast.dao;

import com.itcast.pojo.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersMapper")
public interface OrdersMapper {
    public List<Orders> findAllOrders()throws Exception;
}
