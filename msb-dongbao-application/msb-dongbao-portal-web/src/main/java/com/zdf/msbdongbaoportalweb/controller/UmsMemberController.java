package com.zdf.msbdongbaoportalweb.controller;


import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberRegisterRequestDto;
import com.zdf.msbdongbaoumsapi.service.IUmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/register")
    public String register(@RequestBody UmsMeberRegisterRequestDto umsMeberRegisterRequestDto)
    {
        return iUmsMemberService.register(umsMeberRegisterRequestDto);
    }

    //根据用户名查询记录数量
    @GetMapping("/count/{name}")
    public Integer selectCountByName(@PathVariable("name") String name)
    {
        return iUmsMemberService.selectCountByName(name);
    }


}
