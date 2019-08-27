package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubMenu1 implements Serializable {
    private Integer subMenu1Id;
    private String subMenu1Name;
    private Integer categoryId;
}
