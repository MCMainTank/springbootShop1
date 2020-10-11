package com.mcmaintank.springboot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity{

    private String userLoginname;

    private String userPassword;

    private String userEmail;

    private Long userCellphone;

    private String userAutograph;

    private Long userId;

    private Float userBalance;


}
