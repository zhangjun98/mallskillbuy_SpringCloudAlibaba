package com.seckill.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: zhangjun
 * @Date: 2019/9/8 10:46
 * @Description: 由于是 秒杀项目，所以说时间模块必须统一
 */
@SpringBootApplication
@EnableEurekaClient
public class TimeApplication {
    //时间模块
    public static void main(String[] args) {
        SpringApplication.run(TimeApplication.class,args);
    }
}
