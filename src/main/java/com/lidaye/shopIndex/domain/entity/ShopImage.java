package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShopImage implements Serializable {
    private Integer shopImageId;
    private Integer shopId;
    private String shopImagetype;
}
