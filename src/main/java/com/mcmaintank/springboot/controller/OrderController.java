package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.Order;
import com.mcmaintank.springboot.service.OrderService;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("checkAllOrders")
    public List<Map> checkAllOrders(@RequestParam("username") String username
                                        /*@RequestBody Map o*/){
//        String username = (String) o.get("username");
        Long userId = userService.getUserByName(username).getUserId();
        return orderService.checkAllOrders(userId);
    }

    @ResponseBody
    @RequestMapping("deleteOrderById")
    public List<Map> deleteOrderById(/*@RequestParam("username") String username*/
            @RequestBody Map o){
        Integer orderId = (Integer) o.get("orderId");
        Integer userid = (Integer) o.get("userId");
        orderService.deleteOrderById(orderId.longValue());
        Long userId = userid.longValue();
        return orderService.checkAllOrders(userId);
    }





}
