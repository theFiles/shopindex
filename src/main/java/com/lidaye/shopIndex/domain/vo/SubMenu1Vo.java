package com.lidaye.shopIndex.domain.vo;

import com.lidaye.shopIndex.domain.entity.SubMenu1;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SubMenu1Vo extends SubMenu1 {
    private List<SubMenu2Vo> subMenu2Vos;
}
