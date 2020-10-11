package com.mcmaintank.springboot.service.impl;

import com.mcmaintank.springboot.mapper.CategoryMapper;
import com.mcmaintank.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

}
