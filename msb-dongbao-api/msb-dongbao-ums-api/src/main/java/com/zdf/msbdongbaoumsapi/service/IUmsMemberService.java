package com.zdf.msbdongbaoumsapi.service;

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
    public String register(UmsMeberRegisterRequestDto umsMeberRegisterRequestDto);

    public Integer selectCountByName(String name);
}
