package com.crp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ms-eurekaClient - com.crp
 *
 * @author superChen
 * @create 2017-03-30 16:30
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient   //通过该注解，实现服务发现，注册
public class EurekaClientApplication {

    public static void main(String[] args){

        SpringApplication.run(EurekaClientApplication.class,args);
        log.info("ms-eurekaClient start success!");
    }
}
