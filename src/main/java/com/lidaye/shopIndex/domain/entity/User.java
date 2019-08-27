package com.lidaye.shopIndex.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer userId;
    private Date userLastLogin;
    private String userName;
    private String userPassword;
    private String userIcon;
    private Date userCreateDate;
    private Integer userStatus;
}
