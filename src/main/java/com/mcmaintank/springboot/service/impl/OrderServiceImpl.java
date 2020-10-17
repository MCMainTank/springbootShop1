package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.OrderMapper;
import com.mcmaintank.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;

}
