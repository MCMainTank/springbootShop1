package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
public class ProductController {

    ProductService productService;

    @RequestMapping("store");
    @ResponseBody;
    public

}
