package com.main;

import redis.clients.jedis.Jedis;

public class Redis {
    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost");
        jedis.auth("123456");
        jedis.set("BA1","printdata1.Report");
        jedis.set("BA2","printdata2.Customer");
        jedis.set("BA3","printdata3.CaseReport");
        jedis.set("LA1","printdata1.Report");
        jedis.set("LA2","printdata2.Customer");
        jedis.set("LA3","printdata3.CaseReport");
        jedis.rpush("ss","sadasdas");
        jedis.rpush("ss","sd");
        jedis.rpush("ss","7asd");
        jedis.rpush("ss","sda");

        jedis.lpush("xx","aa");
//       jedis.del("xx");
            System.out.print(jedis.lrange("xx",0,-1));


    }
}