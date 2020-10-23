package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Cart;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
public interface CartService {

    public int addToCart(Cart cart);

    public List<Map> checkCart(Long userId);

    public int deleteCart(Long userId,Long productId);

    public int deleteAllCart(Long userId);

    public int deleteCartById(Long cartId);

}
