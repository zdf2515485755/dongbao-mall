package com.zdf.msbdongbaoumsapi.entity.dto;

import lombok.Data;

@Data
public class UmsMeberRegisterRequestDto
{
    private String username;

    private String password;

    private String icon;

    private String email;

    private String nickName;

    private String note;
}
