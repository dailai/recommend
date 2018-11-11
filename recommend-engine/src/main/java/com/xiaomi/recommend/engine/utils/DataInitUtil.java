package com.xiaomi.recommend.engine.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.ShardedJedis;

/**
 * @author 代来
 * @create 2018/11/11
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DataInitUtil {

    @Autowired
    private JedisPoolUtil jedisPoolUtil;

    @Autowired
    private XMProduct xmProduct;

    @Test
    /**
     * 设置一些默认的推荐数据并存入redis中
     */
    public void initDefaultRecommend(){
//        ShardedJedis resource = jedisPoolUtil.getResource();
        xmProduct.getProduct();
    }

}
