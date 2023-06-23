package com.zdf.msbdongbaoums.mapper;

import com.zdf.msbdongbaoums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest
{
    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    void testInsert()
    {
        UmsMember umsMember = new UmsMember();
        umsMember.setEmail("aaa");
        umsMember.setUsername("zdf");

        umsMemberMapper.insert(umsMember);
    }

    @Test
    void testUpdate()
    {

    }
}
