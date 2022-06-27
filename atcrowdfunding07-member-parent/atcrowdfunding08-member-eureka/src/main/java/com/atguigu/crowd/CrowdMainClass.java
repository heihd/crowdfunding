package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname CrowdMainClass
 * @Description TODO
 * @Date 2022/6/14 22:41
 * @Created by 林带鱼
 */
@EnableEurekaServer
@SpringBootApplication
public class CrowdMainClass {
    public static void main(String[] args) {
        SpringApplication.run(CrowdMainClass.class, args);
    }
}
