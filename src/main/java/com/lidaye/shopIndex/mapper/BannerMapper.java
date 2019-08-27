package com.lidaye.shopIndex.mapper;

import com.lidaye.shopIndex.domain.vo.BannerVo;

import java.util.List;

public interface BannerMapper {
    List<BannerVo> findBannerAll();
}
