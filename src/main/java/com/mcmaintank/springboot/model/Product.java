package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Product extends BaseEntity{

    private Long productId;

    private String productName;

    private Long categoryId;

    private String productDescription;

    private Float productPrice;

    private String productImgpath;

    private Date createDate;




}
