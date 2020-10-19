package com.mcmaintank.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
@Controller
@RequestMapping("store")
public class CartController {



/**When submitting a addtocart request,first check if user has the access to his cart
 * 
 *
 *
 * */
    @RequestMapping("addToCart")
    public String addToCart(@RequestParam("number")int number,
                            @RequestParam("productid")String productId,
                            Map<String,Object> map){

        return "cartSuccess";
    }

    @RequestMapping("checkOut")
    public String checkOut(){


        return "success";

//        return "insufficientfund";

    }

}
