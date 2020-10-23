package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.CartMapper;
import com.mcmaintank.springboot.mapper.ProductMapper;
import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
@Service
public class CartServiceImpl implements CartService {


    @Autowired
    CartMapper cartMapper;

    @Autowired
    ProductMapper productMapper;


    @Override
    public int addToCart(Cart cart) {
        if(cartMapper.insertCart(cart)==1){
            return 1;
        }else{
            return 0;
        }


    }

    @Override
    public List<Map> checkCart(Long userId) {
        return cartMapper.selectCartById(userId);
    }

    @Override
    public int deleteCart(Long userId,Long productId) {
        return 0;
    }

    @Override
    public int deleteAllCart(Long userId) {
        return 0;
    }

    @Override
    public int deleteCartById(Long cartId) {
        return cartMapper.deleteCartById(cartId);
    }


}
