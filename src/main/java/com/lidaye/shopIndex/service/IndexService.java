package com.lidaye.shopIndex.service;

import com.lidaye.shopIndex.domain.vo.CategoryVo;
import com.lidaye.shopIndex.domain.vo.ShopVo;
import com.lidaye.shopIndex.utils.IndexHeadRes;

import java.util.List;

public interface IndexService {
    IndexHeadRes getHeadInfo();
    List<CategoryVo> getCateShop();
}
