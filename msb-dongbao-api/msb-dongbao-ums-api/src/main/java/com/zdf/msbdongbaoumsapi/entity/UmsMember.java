package com.zdf.msbdongbaoumsapi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
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

    @Size(min = 1, max = 8, message = "用户名长度必须在1到8之间")
    private String username;

    private String password;

    private String icon;

    @Email
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
