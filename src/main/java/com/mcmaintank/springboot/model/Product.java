package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Entity
@Table(name="eshop_product",schema="public")
@EqualsAndHashCode(callSuper = true)
@Data
public class Product extends BaseEntity{

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long productId;

    private String productName;

    private Long categoryId;

    private String productDescription;

    private Float productPrice;

    private String productImgpath;


    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Id
    public Long getProductId() {
        return productId;
    }
}
