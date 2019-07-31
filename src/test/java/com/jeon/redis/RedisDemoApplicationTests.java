package com.jeon.redis;

import com.jeon.redis.Entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDemoApplicationTests {

    @Resource(name = "defaultRedisTemplate")
    private RedisTemplate<String, Object> redisTemplate;

    @Resource(name = "cacheRedisTemplate")
    private RedisTemplate<String, Object> redisTemplate1;

    @Test
    public void stringRedisTest() {

        redisTemplate.opsForValue().set("slzzzz", "111111");
        redisTemplate1.opsForValue().set("slzzzz", "222222");

    }

    @Test
    public void objectRedisTest() {
        redisTemplate.opsForValue().set("person", new Person("李飞", 20, "临汾", "lf@lilian.com", "1324567891"));
        redisTemplate1.opsForValue().set("person", new Person("李大壮", 35, "西安", "ldz@lilian.com", "1324567891"));
    }

}
