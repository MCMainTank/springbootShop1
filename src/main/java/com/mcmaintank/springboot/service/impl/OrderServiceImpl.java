package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.CartMapper;
import com.mcmaintank.springboot.mapper.OrderMapper;
import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.model.Order;
import com.mcmaintank.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;

    @Autowired
    CartMapper cartMapper;


    @Override
    public int createOrder(List<Cart> cartList) {
        List<Order> orderList = null;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date createDate = new Date();
        for (int i = 0; i < cartList.size(); i++) {
            try{
                orderList.get(i).setUserId(cartList.get(i).getUserId());
                orderList.get(i).setProductId(cartList.get(i).getProductId());
                orderList.get(i).setProductQuantity(cartList.get(i).getProductQuantity());
                orderList.get(i).setOrderId(orderMapper.selectLatestOrderId()+1L);
                try{
                    createDate = df.parse(df.format(new Date()));
                }catch(Exception e){
                    e.printStackTrace();
                }
                orderList.get(i).setCreateDate(createDate);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return 0;
    }
}
