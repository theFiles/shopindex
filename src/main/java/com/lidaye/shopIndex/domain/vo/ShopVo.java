package com.lidaye.shopIndex.domain.vo;

import com.lidaye.shopIndex.domain.entity.Shop;
import com.lidaye.shopIndex.domain.entity.ShopImage;
import lombok.Data;

import java.util.List;

@Data
public class ShopVo extends Shop {
    private List<ShopImage> shopImages;
}
