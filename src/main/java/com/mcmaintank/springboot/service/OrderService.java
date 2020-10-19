package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Cart;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface OrderService {

    public int createOrder(List<Cart> cart);

}
