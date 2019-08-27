package com.lidaye.shopIndex.controller;

import com.lidaye.shopIndex.service.ListService;
import com.lidaye.shopIndex.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/ShopList")
public class ShopList {
    @Resource
    private ListService cateService;

    @GetMapping("/CateShop")
    public Result cateShop(@RequestParam int cid){
        try{
            return Result.resultSuccess(cateService.getShopFoCate(cid));
        }
        catch(Exception e){
            return Result.resultError();
        }
    }

    @GetMapping("/SearchShop")
    public Result searchShop(String search,Integer type){
        try{
            return Result.resultSuccess(cateService.getShopToSearch(search,type));
        }
        catch(Exception e){
            e.printStackTrace();
            return Result.resultError();
        }
    }
}
