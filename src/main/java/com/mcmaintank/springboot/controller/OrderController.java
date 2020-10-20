package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.Order;
import com.mcmaintank.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("checkAllOrders")
    public List<Order> checkAllOrders(@RequestParam("userId") Long userId){
        return orderService.checkAllOrders(userId);
    }





}
