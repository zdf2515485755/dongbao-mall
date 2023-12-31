package com.zdf.msbdongbaoums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zdf.msbdongbaocommonbase.result.ResponseResult;
import com.zdf.msbdongbaoums.mapper.UmsMemberMapper;
import com.zdf.msbdongbaoumsapi.entity.UmsMember;
import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberLogInRequestDto;
import com.zdf.msbdongbaoumsapi.entity.dto.UmsMeberRegisterRequestDto;
import com.zdf.msbdongbaoumsapi.service.IUmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zdf
 * @since 2023-06-23
 */
@Service
public class UmsMemberServiceImpl implements IUmsMemberService
{
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ResponseResult register(UmsMeberRegisterRequestDto umsMeberRegisterRequestDto)
    {
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMeberRegisterRequestDto, umsMember);

        String encode = passwordEncoder.encode(umsMember.getPassword());
        umsMember.setPassword(encode);

        return umsMemberMapper.insert(umsMember) > 0 ? ResponseResult.success("") : ResponseResult.fail();
    }

    public ResponseResult<Integer> selectCountByName(@PathVariable("name") String name)
    {
        QueryWrapper<UmsMember> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("username", name);

        Integer count = umsMemberMapper.selectCount(objectQueryWrapper);

        return ResponseResult.success(count);
    }

    @Override
    public ResponseResult logIn(UmsMeberLogInRequestDto umsMeberLogInRequestDto)
    {
        String password = umsMeberLogInRequestDto.getPassword();
        QueryWrapper<UmsMember> umsMemberQueryWrapper = new QueryWrapper<>();

        umsMemberQueryWrapper.eq("username", umsMeberLogInRequestDto.getUsername());
        UmsMember umsMember = umsMemberMapper.selectOne(umsMemberQueryWrapper);

        if (null != umsMember)
        {
            return passwordEncoder.matches(password, umsMember.getPassword()) ? ResponseResult.success("") : ResponseResult.fail();
        }
        return ResponseResult.fail();
    }
}
