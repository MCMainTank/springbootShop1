package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Product;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface ProductService {

    public void deleteProduct(Long id);

    public Product createProduct(Long id);
}
