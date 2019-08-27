package com.lidaye.shopIndex.mapper;

import com.lidaye.shopIndex.domain.vo.ShopVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    List<ShopVo> findShopByCateId(@Param("cid") int cid);
    List<ShopVo> findShopByShopName(@Param("name") String name,@Param("type") Integer type);
}
