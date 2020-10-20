package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.CartMapper;
import com.mcmaintank.springboot.mapper.ProductMapper;
import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
public class CartServiceImpl implements CartService {


    @Autowired
    CartMapper cartMapper;

    @Autowired
    ProductMapper productMapper;


    @Override
    public int addToCart(int number, Long productId) {
        Cart cart = new Cart();
        try{
            cart.setCartId(null);
            cart.setProductId(productId);
            cart.setProductQuantity(number);
            cart.setDeletedLogic(0);


        }catch (Exception e){
            e.printStackTrace();
        }
        try{

        }catch (Exception e){
            e.printStackTrace();
        }


        return 0;
    }

    @Override
    public List<Cart> checkCart(Long userId) {


        return null;

    }

    @Override
    public int deleteCart(Long userId,Long productId) {
        return 0;
    }

    @Override
    public int deleteAllCart(Long userId) {
        return 0;
    }


}
