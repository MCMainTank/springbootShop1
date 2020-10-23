package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.model.Order;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface OrderService {

    public int createOrder(List<Cart> cart);

    public List<Map> checkAllOrders(Long userId);

    public int deleteOrderById(Long orderId);
}
