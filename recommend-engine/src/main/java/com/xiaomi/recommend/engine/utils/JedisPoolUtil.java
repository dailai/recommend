package com.xiaomi.recommend.engine.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import java.util.LinkedList;

/**
 * @author 代来
 * @create 2018/11/11
 * @description redis连接池工具类
 */
@Component
public class JedisPoolUtil {

    private ShardedJedisPool shardedJedisPool;
    @Value("${spring.redis.port}")
    private Integer redisPort;

    public ShardedJedisPool getShardedJedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //控制一个pool最多有多少个空闲的jedis实例
        jedisPoolConfig.setMaxIdle(5);
        //控制一个pool可以分配多少个jedis实例，-1表示不限制
        jedisPoolConfig.setMaxTotal(-1);
        //引入一个jedis实例最大等待时间
        jedisPoolConfig.setMaxWaitMillis(5);
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);
        //创建四个redis实例，并封装在list中
        LinkedList<JedisShardInfo> lists = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            lists.add(new JedisShardInfo("redis" + i, redisPort));
        }
        shardedJedisPool = new ShardedJedisPool(jedisPoolConfig, lists);
        return shardedJedisPool;
    }

    public ShardedJedis getResource() {
        return getShardedJedisPool().getResource();
    }
}
