package com.xiaomi.recommend.engine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 代来
 * @create 2018/11/11
 * @description 商品
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {
    /**
     * 商品编号
     */
    private String id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private String price;
    /**
     * 商品图片地址
     */
    private String img;
    /**
     * 跳转到详情页
     */
    private String url;
    /**
     * 商品状态
     */
    private int status = 1;

    @Override
    public boolean equals(Object obj){
        Product obj1 = (Product) obj;
        return this.id.equals(obj1.getId());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
