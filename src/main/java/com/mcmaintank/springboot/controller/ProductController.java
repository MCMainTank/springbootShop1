package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.Product;
import com.mcmaintank.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
//Admin functions/Managing interface
@Controller
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping("itemList")
    @ResponseBody
    public String getProductImage(@RequestParam("productId") Long productId){
        return productService.getProductImageById(productId);
    }

    @RequestMapping("getAllProduct")
    @ResponseBody
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }



}
