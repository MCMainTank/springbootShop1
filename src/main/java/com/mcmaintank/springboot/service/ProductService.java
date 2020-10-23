package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.Product;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface ProductService {

    public void deleteProduct(Long id);

    public Product createProduct(Product product);

    public String getProductImageById(Long id);

    public List<Product> getAllProduct();



}
