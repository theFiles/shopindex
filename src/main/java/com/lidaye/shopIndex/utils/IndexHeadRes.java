package com.lidaye.shopIndex.utils;

import com.lidaye.shopIndex.domain.entity.Navigation;
import com.lidaye.shopIndex.domain.vo.BannerVo;
import com.lidaye.shopIndex.domain.vo.CategoryVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class IndexHeadRes implements Serializable {
    List<BannerVo> banners;
    List<Navigation> navs;
    List<CategoryVo> categorys;
}
