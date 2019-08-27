package com.lidaye.shopIndex.service.impl;

import com.lidaye.shopIndex.domain.entity.Navigation;
import com.lidaye.shopIndex.domain.vo.BannerVo;
import com.lidaye.shopIndex.domain.vo.CategoryVo;
import com.lidaye.shopIndex.mapper.BannerMapper;
import com.lidaye.shopIndex.mapper.CategoryMapper;
import com.lidaye.shopIndex.mapper.NavigationMapper;
import com.lidaye.shopIndex.service.IndexService;
import com.lidaye.shopIndex.utils.IndexHeadRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    private BannerMapper bannerMapper;
    @Resource
    private NavigationMapper navigationMapper;
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public IndexHeadRes getHeadInfo() {
        IndexHeadRes indexHeadRes = new IndexHeadRes();
        List<BannerVo> banners = bannerMapper.findBannerAll();
        List<Navigation> navs = navigationMapper.findNavAll();
        List<CategoryVo> categorys = categoryMapper.findCategoryAll();

        indexHeadRes.setBanners(banners);
        indexHeadRes.setNavs(navs);
        indexHeadRes.setCategorys(categorys);

        return indexHeadRes;
    }

    @Override
    public List<CategoryVo> getCateShop() {
        List<CategoryVo> shops = categoryMapper.findShopGroupCate();
        return shops;
    }
}
