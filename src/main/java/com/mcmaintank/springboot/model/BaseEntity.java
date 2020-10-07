package com.mcmaintank.springboot.model;

import lombok.Data;

/**
 * @author MCMainTank
 * @create 2020/9/2
 */

@Data
public abstract class BaseEntity {

    private Integer pageSize;

    private Integer pageNum;

    private Integer total;

    private String sort;

    private String orderBy;


}
