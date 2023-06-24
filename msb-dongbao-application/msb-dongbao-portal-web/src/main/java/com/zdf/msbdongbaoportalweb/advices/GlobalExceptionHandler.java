package com.zdf.msbdongbaoportalweb.advices;

import com.zdf.msbdongbaocommonbase.result.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局统一异常
 */
@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(Exception.class)
    public ResponseResult customException()
    {
        return new ResponseResult().setCode(301).setMessage("统一异常");
    }
}
