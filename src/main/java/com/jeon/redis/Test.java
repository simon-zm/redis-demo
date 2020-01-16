package com.jeon.redis;

import com.mongodb.MongoClient;
import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import org.bson.Document;
import redis.clients.jedis.Jedis;

public class Test {
    public static void main(String[] args) {

//        Jedis jedis = new Jedis("47.99.213.83",6380);
//        System.out.println(jedis.ping());
        MongoClient mongoClient =new MongoClient("47.99.213.83");
        ListDatabasesIterable<Document> documents = mongoClient.listDatabases();
        System.out.println(JSON.serialize(documents));

    }
    void test(){
        System.out.println("0000000000000");
    }
}
