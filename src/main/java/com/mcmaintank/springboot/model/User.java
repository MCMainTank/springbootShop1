package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Entity
//@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity{

    private String userLoginname;

    private String userPassword;

    private String userEmail;

    private Long userCellphone;

    private String userAutograph;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;

    private Float userBalance;
    private String id;

    public void setUserId(String id) {
        this.id = id;
    }

    @javax.persistence.Id
    public String getUserId() {
        return id;
    }
}
