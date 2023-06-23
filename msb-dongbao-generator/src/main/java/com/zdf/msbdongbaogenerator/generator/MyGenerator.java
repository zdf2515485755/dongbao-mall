package com.zdf.msbdongbaogenerator.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MyGenerator
{
    public static void main(String[] args)
    {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/dongbao-mall?character-Encoding=utf-8&serverTimezone=GMT%2B8", "root", "zdf19941118.")
                .globalConfig(builder -> {
                    builder.author("zdf")
                            .fileOverride()
                            .outputDir("/Users/mrzhang/Desktop/Project/msb-dongbao-mall-parent/msb-dongbao-service/msb-dongbao-ums/src/main/java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.zdf.msbdongbaoums")
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "/Users/mrzhang/Desktop/Project/msb-dongbao-mall-parent/msb-dongbao-service/msb-dongbao-ums/src/main/java/com/zdf/msbdongbaoums/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ums_member");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
