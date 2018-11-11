package com.xiaomi.recommend.engine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;
import javax.annotation.security.DenyAll;

/**
 * @author 代来
 * @create 2018/11/11
 * @description 推荐模板
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Template {
    /**
     * 推荐的商品数量
     */
    private int num;
    /**
     * 返回结果的方式(1.json 2. html)
     */
    private int type;
    /**
     * 推荐位强推的产品列表
     */
    private Map<Integer,Product> products;
}
