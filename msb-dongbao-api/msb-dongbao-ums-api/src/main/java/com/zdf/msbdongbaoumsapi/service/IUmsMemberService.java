package com.zdf.msbdongbaoumsapi.service;

import com.zdf.msbdongbaocommonbase.result.ResponseResult;
import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberLogInRequestDto;
import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberRegisterRequestDto;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zdf
 * @since 2023-06-23
 */
public interface IUmsMemberService
{
    public ResponseResult register(UmsMeberRegisterRequestDto umsMeberRegisterRequestDto);

    public ResponseResult<Integer> selectCountByName(String name);

    public ResponseResult logIn(UmsMeberLogInRequestDto umsMeberLogInRequestDto);
}
