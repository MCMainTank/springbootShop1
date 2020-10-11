package com.mcmaintank.springboot.model;

import lombok.Data;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Data
public class Order {

    private Long orderId;

    private Long userId;

    private Long productId;

    private Long productQuantity;

    private Long orderNumber;

}
