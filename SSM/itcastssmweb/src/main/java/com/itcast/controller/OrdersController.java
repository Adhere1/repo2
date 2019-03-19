package com.itcast.controller;

import com.github.pagehelper.PageInfo;
import com.itcast.pojo.Orders;
import com.itcast.service.IOrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrdersController {
    @Resource
    private IOrdersService ordersService;


    @RequestMapping("/findAllOrders")
    public String findAllOrders(Model model,
                                @RequestParam(name = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(name = "pageSize", required = true, defaultValue = "3") Integer pageSize) throws Exception {
        List<Orders> ordersList=ordersService.findAllOrders(page,pageSize);
        //使用pageInfo对象将分页信息传递到页面:
        PageInfo pageinfo=new PageInfo(ordersList);
        model.addAttribute("ordersList",pageinfo);
        return "orders-list-page";
    }
}
