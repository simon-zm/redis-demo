package com.jeon.redis;

import redis.clients.jedis.Jedis;

public class Test {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("47.99.213.83",6380);
        System.out.println(jedis.ping());
        System.out.println("第三方的发达");
        System.out.println("第三方的发达");
        System.out.println("第三方的发达");
        System.out.println("第三方的发达");
        System.out.println("第三方的发达");
        System.out.println("第三方的发达");


    }
    void test(){
        System.out.println("0000000000000");
    }
}
