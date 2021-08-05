package com.pyzq.website.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 实体java对象，和数据库中的记录一一对应
 * @TableName("user")对应user表
 * @Data表示使用lombok自动生成实体类的get和set方法
 * @TableId(type = IdType.AUTO)将主键设置为自增
 */
@TableName("user")
@Data
public class User {
    @TableId(type = IdType.AUTO, value = "id")
    private Integer id;
    private String username;
    private String password;
    private String nickName;
    private Integer age;
    private String sex;
    private String address;
    private Integer role;
}
