package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.model.Order;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface OrderService {

    public int createOrder(List<Cart> cart);

    public List<Order> checkAllOrders(Long userId);
}
