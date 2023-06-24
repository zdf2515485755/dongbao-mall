package com.zdf.msbdongbaoportalweb.controller;


import com.zdf.msbdongbaocommonbase.result.ResponseResult;
import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberLogInRequestDto;
import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberRegisterRequestDto;
import com.zdf.msbdongbaoumsapi.service.IUmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zdf
 * @since 2023-06-23
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController
{
    @Autowired
    private IUmsMemberService iUmsMemberService;

    //注册用户
    @PostMapping("/register")
    public ResponseResult register(@RequestBody @Valid UmsMeberRegisterRequestDto umsMeberRegisterRequestDto)
    {
        return iUmsMemberService.register(umsMeberRegisterRequestDto);
    }

    //根据用户名查询记录数量
    @PostMapping("/count/{name}")
    public ResponseResult<Integer> selectCountByName(@PathVariable("name")@Valid String name)
    {
        return iUmsMemberService.selectCountByName(name);
    }

    @PostMapping("/login")
    public ResponseResult<String> logIn(@RequestBody @Valid UmsMeberLogInRequestDto umsMeberLogInRequestDto)
    {
        return iUmsMemberService.logIn(umsMeberLogInRequestDto);
    }


}
