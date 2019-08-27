package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShopShopcar implements Serializable {
    private Integer shopShopcarId;
    private Integer shopShopcarNumber;
    private Integer shopId;
    private Integer userId;
    private Integer orderId;
    private Integer shopShopcarStatus;
}
