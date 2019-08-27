package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Navigation implements Serializable {
    private Integer navigationId;
    private String navigationName;
}
