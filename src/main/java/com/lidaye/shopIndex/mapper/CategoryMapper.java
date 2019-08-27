package com.lidaye.shopIndex.mapper;

import com.lidaye.shopIndex.domain.vo.CategoryVo;

import java.util.List;

public interface CategoryMapper {
    List<CategoryVo> findCategoryAll();
    List<CategoryVo> findShopGroupCate();
}
