package com.zdf.msbdongbaoums.config;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class timeUpdateHandler implements MetaObjectHandler
{

    //插入数据的时候更新数据时间
    @Override
    public void insertFill(MetaObject metaObject)
    {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    //更新数据的时候更新数据时间
    @Override
    public void updateFill(MetaObject metaObject)
    {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
