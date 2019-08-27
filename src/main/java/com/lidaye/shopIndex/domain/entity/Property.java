package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Property implements Serializable {
    private Integer propertyId;
    private Integer categoryId;
    private String propertyName;
}
