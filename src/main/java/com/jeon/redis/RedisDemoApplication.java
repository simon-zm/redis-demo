package com.jeon.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);

        //这是主分支的代码
        Object o=new Object();
        Object o2=new Object();
        Object o3=new Object();
    }

}
