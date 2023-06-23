package com.zdf.msbdongbaoumsapi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zdf
 * @since 2023-06-23
 */
@TableName("ums_member")
@Data
public class UmsMember implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private String icon;

    private String email;

    private String nickName;

    private String note;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private Date loginTime;

    private Integer status;

}
