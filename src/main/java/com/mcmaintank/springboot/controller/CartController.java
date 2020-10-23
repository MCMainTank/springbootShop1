package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.mapper.CartMapper;
import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.model.Order;
import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.CartService;
import com.mcmaintank.springboot.service.OrderService;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
@Controller
//@RequestMapping("store")
public class CartController {

        @Autowired
        OrderService orderService;

        @Autowired
        CartService cartService;

        @Autowired
        UserService userService;
//    @Autowired
//    CartService cartService;


/**When submitting a addtocart request,first check if user has the access to his cart
 * 
 *
 *
 * */
    @RequestMapping("addToCart")
    @ResponseBody
    public String addToCart(/*@RequestParam("number")int number,
                            @RequestParam("productid")String productId,
                            Map<String,Object> map*/
                            @RequestBody Map o){
        Cart cart = new Cart();
        Integer productId = (Integer) o.get("productId");
        String orderAddress = (String) o.get("orderAddress");
        Integer productQuantity = (Integer) o.get("productQuantity");
        Integer productWarranty = (Integer) o.get("productWarranty");
        String productColor = (String) o.get("productColor");
        Integer userId = (Integer) o.get("userId");
        cart.setProductId(productId.longValue());
        cart.setDeliverAddress(orderAddress);
        cart.setProductQuantity(productQuantity);
        cart.setProductWarranty(productWarranty);
        cart.setProductColor(productColor);
        cart.setUserId(userId.longValue());
        Integer deletedLogic = 0;
        cart.setDeletedLogic(deletedLogic);

        if(cartService.addToCart(cart)==1){
            String jsonString1 = "{\"status\":1}";
            return jsonString1;
        }else{
            String jsonString2 = "{\"status\":0}";
            return jsonString2;
        }
    }

    @RequestMapping("checkOut")
    @ResponseBody
    public String checkOut(@RequestBody Map o){
        Order order = new Order();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date createDate = new Date();
        try{
            createDate = df.parse(df.format(new Date()));
        }catch(Exception e){
            e.printStackTrace();
        }
        Integer productId = (Integer) o.get("productId");
        String orderAddress = (String) o.get("orderAddress");
        Integer productQuantity = (Integer) o.get("productQuantity");
        Integer productWarranty = (Integer) o.get("productWarranty");
        String productColor = (String) o.get("productColor");
        Integer userId = (Integer) o.get("userId");
        String userBalance = (String) o.get("userBalance");
        BigDecimal fund = new BigDecimal(userBalance);
        Integer deletedLogic = 0;
        order.setCreateDate(createDate);
        order.setProductId(productId.longValue());
        order.setOrderAddress(orderAddress);
        order.setProductQuantity(productQuantity);
        order.setProductWarranty(productWarranty);
        order.setProductColor(productColor);
        order.setUserId(userId.longValue());
        order.setDeletedLogic(deletedLogic);




        if((orderService.createSingleOrder(order)==1)&&(userService.modifyUser(userId.longValue(),fund)==1)){
            String jsonString1 = "{\"status\":1}";
            return jsonString1;
        }else{
            String jsonString2 = "{\"status\":0}";
            return jsonString2;
        }




//        return "insufficientfund";

    }

    @RequestMapping("checkCart")
    @ResponseBody
    public List<Map> checkCart(@RequestBody Map o){
        String username = (String) o.get("username");
        Long userId = userService.getUserByName(username).getUserId();
      return cartService.checkCart(userId);

    }

    @ResponseBody
    @RequestMapping("deleteCartById")
    public List<Map> deleteCartById(/*@RequestParam("username") String username*/
            @RequestBody Map o){
        Integer cartId = (Integer) o.get("cartId");
        Integer userid = (Integer) o.get("userId");
        cartService.deleteCartById(cartId.longValue());
        Long userId = userid.longValue();
        return cartService.checkCart(userId);
    }


}
