package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.postgresql.util.PGmoney;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Entity
@Table(name="eshop_user",schema="public")
//@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity{

    private String userLoginname;

    private String userPassword;

    private String userEmail;

    private Long userCellphone;

    private String userAutograph;



    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;

    private BigDecimal userBalance;


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
