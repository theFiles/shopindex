package com.lidaye.shopIndex.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Result implements Serializable{
    private int code;
    private Object data;

    public static Result resultSuccess(Serializable data){
        Result res = new Result();
        res.setCode(ResultCode.SUCCESS);
        res.setData(data);
        return res;
    }

    public static Result resultSuccess(List<? extends Serializable> data){
        Result res = new Result();
        res.setCode(ResultCode.SUCCESS);
        res.setData(data);
        return res;
    }


    public static Result resultError(){
        Result res = new Result();
        res.setCode(ResultCode.ERROR);
        return res;
    }

}
