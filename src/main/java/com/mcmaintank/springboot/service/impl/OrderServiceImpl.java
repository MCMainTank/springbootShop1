package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.OrderMapper;
import com.mcmaintank.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;

}
