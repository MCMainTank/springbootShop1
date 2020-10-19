package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Cart;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
public interface CartService {

    public int addToCart(int number, Long productId);

    public List<Cart> checkCart(Long userId);

    public int deleteCart(Long userId,Long productId);

    public int deleteAllCart(Long userId);

}
