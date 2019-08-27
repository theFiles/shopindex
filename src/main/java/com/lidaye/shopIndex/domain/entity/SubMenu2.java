package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubMenu2 implements Serializable {
    private Integer subMenu2Id;
    private String subMenu2Name;
    private Integer subMenu1Id;
}
