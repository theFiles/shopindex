package com.lidaye.shopIndex.controller;

import com.lidaye.shopIndex.service.IndexService;
import com.lidaye.shopIndex.utils.IndexHeadRes;
import com.lidaye.shopIndex.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ShopIndex {
    @Resource
    private IndexService indexService;

    @GetMapping("/IndexHead")
    public Result indexHead(){
        try {
            return Result.resultSuccess(indexService.getHeadInfo());
        }
        catch (Exception e){
            return Result.resultError();
        }
    }

    @GetMapping("/IndexShop")
    public Result IndexShop(){
        try {
            return Result.resultSuccess(indexService.getCateShop());
        }
        catch (Exception e){
            return Result.resultError();
        }
    }
}
