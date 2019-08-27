package com.lidaye.shopIndex.service.impl;

import com.lidaye.shopIndex.domain.vo.ShopVo;
import com.lidaye.shopIndex.mapper.ShopMapper;
import com.lidaye.shopIndex.service.ListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ListServiceImpl implements ListService {
    @Resource
    private ShopMapper shopMapper;

    @Override
    public List<ShopVo> getShopFoCate(int cid) {
        List<ShopVo> shops = shopMapper.findShopByCateId(cid);
        return shops;
    }

    @Override
    public List<ShopVo> getShopToSearch(String name,Integer type) {
        List<ShopVo> shops = shopMapper.findShopByShopName(name,type);
        return shops;
    }
}
