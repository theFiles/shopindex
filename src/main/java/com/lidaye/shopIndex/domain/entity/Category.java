package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category implements Serializable {
    private Integer categoryId;
    private String categoryName;
}
