package com.lidaye.shopIndex;

import com.alibaba.fastjson.JSON;
import com.lidaye.shopIndex.domain.entity.Banner;

public class App {
    public static void main(String[] args) {
        Banner banner = JSON.parseObject("{\"bannerId\":1,\"bannerTitle\":\"aaa\"}", Banner.class);
        System.out.println(banner);
    }
}
