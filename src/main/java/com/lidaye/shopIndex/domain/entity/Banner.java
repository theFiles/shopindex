package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Banner implements Serializable {
    private Integer bannerId;
    private String bannerTitle;
    private String bannerImage;
    private String bannerDetailUrl;
    private Integer bannerOrder;
    private Date bannerCreateTime;

}
