package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.ProductMapper;
import com.mcmaintank.springboot.model.Product;
import com.mcmaintank.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    ProductMapper productMapper;

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public String getProductImageById(Long id) {
        return productMapper.selectProductImageById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productMapper.selectAllProduct();
    }

}
