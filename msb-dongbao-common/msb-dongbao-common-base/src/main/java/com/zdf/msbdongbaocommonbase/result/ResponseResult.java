package com.zdf.msbdongbaocommonbase.result;

import com.zdf.msbdongbaocommonbase.enums.CommonStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)

public class ResponseResult <T> implements Serializable
{
    private Integer code;

    private String message;

    private T data;

    public static<T> ResponseResult success(T data)
    {
        return new ResponseResult().setCode(CommonStatusEnum.SUCCESS.getCode()).setMessage(CommonStatusEnum.SUCCESS.getMessage()).setData(data);
    }

    public static  ResponseResult fail()
    {
        return new ResponseResult().setCode(CommonStatusEnum.FAIL.getCode()).setMessage(CommonStatusEnum.FAIL.getMessage());
    }

    /**
     * 自定义返回错误信息
     * @param code
     * @param message
     * @return
     */
    public static ResponseResult fail(Integer code, String message)
    {
        return new ResponseResult().setCode(code).setMessage(message);
    }

    /**
     * 自定义返回正确信息
     * @param code
     * @param message
     * @param data
     * @return
     * @param <T>
     */
    public static<T> ResponseResult success(Integer code, String message, T data)
    {
        return new ResponseResult().setCode(code).setMessage(message).setData(data);
    }
}
