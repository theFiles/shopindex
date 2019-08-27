package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Shop implements Serializable {
    private Integer shopId;
    private String shopName;
    private String shopSubTitle;
    private Double shopOriginalPrice;
    private Double shopPromotePrice;
    private Integer shopStock;
    private Integer categoryId;
    private Date shopCreateDate;
}
