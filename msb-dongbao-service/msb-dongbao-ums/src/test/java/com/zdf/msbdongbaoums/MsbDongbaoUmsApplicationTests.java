package com.zdf.msbdongbaoums;

import com.zdf.msbdongbaoums.entity.UmsMember;
import com.zdf.msbdongbaoums.mapper.UmsMemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MsbDongbaoUmsApplicationTests {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    void contextLoads()
    {

        UmsMember umsMember = new UmsMember();
        umsMember.setUsername("zdf");
        umsMember.setEmail("www.baidu.com");
        umsMemberMapper.insert(umsMember);

    }

}
