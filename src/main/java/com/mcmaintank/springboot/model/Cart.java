package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
@Entity
@Table(name="eshop_cart",schema="public")
@EqualsAndHashCode(callSuper = true)
@Data
public class Cart extends BaseEntity{


    private Long cartId;

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    @Id
    public Long getCartId() {
        return cartId;
    }

    private int productQuantity;

    private Long userId;

    private Long productId;

    private boolean deletedLogic;
}
