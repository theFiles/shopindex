package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Review implements Serializable {
    private Integer reviewId;
    private String reviewContent;
    private Date reviewCreateDate;
    private Integer shopId;
    private Integer userId;
}
