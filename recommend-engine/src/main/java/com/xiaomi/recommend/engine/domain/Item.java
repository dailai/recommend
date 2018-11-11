package com.xiaomi.recommend.engine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 代来
 * @create 2018/11/11
 * @description
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Comparable{

    private String id;
    private Double weight;

    @Override
    public int compareTo(Object o) {
        Item item = (Item)o;
        Double weight = item.getWeight();
        return this.weight >weight?1:(this.weight <weight?-1:0);
    }
}
