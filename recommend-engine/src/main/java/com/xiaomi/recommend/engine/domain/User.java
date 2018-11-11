package com.xiaomi.recommend.engine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author 代来
 * @create 2018/11/11
 * @description 用户
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {

    /**
     * 用户Id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户生日
     */
    private Date birthday;
    /**
     * 用户性别
     */
    private String sex;
    /**
     * 用户地址
     */
    private String  address;
}
