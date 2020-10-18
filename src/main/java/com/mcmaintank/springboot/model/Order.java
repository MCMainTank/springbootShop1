package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Entity
@Table(name="eshop_order",schema="public")
//@EqualsAndHashCode(callSuper = true)
@Data
public class Order extends BaseEntity{


    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long orderId;

    private Long userId;

    private Long productId;

    private int productQuantity;

    private Long orderNumber;

    private Date createDate;


    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}
