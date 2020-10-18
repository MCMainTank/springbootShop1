package com.mcmaintank.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
public class CartController {




    @RequestMapping("addToCart")
    public String addToCart(){

        return "cartSuccess";
    }

    @RequestMapping("checkOut")
    public String checkOut(){

        return "success";

//        return "insufficientfund";

    }

}
