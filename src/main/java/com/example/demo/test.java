package com.example.demo;

import redis.clients.jedis.Jedis;

public class test {

    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost");
        jedis.auth("123456");
        System.out.println(jedis.ping());
        jedis.set("a","qw");
        jedis.append("a","窝");
//       jedis.del("a");
        jedis.sadd("user","name");
        jedis.sadd("user","age");
        jedis.sadd("user","tell");
        jedis.sadd("user1","name1");
        jedis.sadd("user1","age1");
        jedis.sadd("user1","tell1");
        System.out.println(jedis.smembers("user"));
        System.out.println(jedis.scard("user"));
        System.out.println(jedis.sismember("user","who"));
//        String[] user = new Stri1ng[]{"user","user1"};
//        String[] value = new String[]{"tell","tell1"};
//        System.out.println(jedis.sismember(user[1],user[0]));
        System.out.println(jedis.srandmember("user"));
        String s = jedis.get("a");
        System.out.print(s);
    }
}