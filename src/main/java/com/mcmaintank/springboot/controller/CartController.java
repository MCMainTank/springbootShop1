package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
@Controller
@RequestMapping("store")
public class CartController {


//    @Autowired
//    CartService cartService;


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

    @RequestMapping("checkCart")
    public List<Cart> checkCart(){

      return null;

    }

}
