package com.zdf.msbdongbaocommonbase.enums;

import lombok.Getter;


public enum CommonStatusEnum
{
    SUCCESS(1, "success"),

    FAIL(0, "fail");

    @Getter
    private Integer code;

    @Getter
    private String message;

    CommonStatusEnum(Integer code, String message)
    {
        this.code = code;
        this.message = message;
    }
}
