package com.lidaye.shopIndex.domain.vo;

import com.lidaye.shopIndex.domain.entity.Category;
import com.lidaye.shopIndex.domain.entity.Shop;
import com.lidaye.shopIndex.domain.entity.ShopImage;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVo extends Category {
    private List<SubMenu1Vo> subMenu1Vos;
    private List<Shop> shops;
}
