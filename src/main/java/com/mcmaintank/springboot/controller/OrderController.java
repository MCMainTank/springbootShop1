package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;





}
