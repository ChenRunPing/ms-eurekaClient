package com.crp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ms-eureka - com.crp.controller
 *
 * @author superChen
 * @create 2017-03-30 13:34
 */
@RestController
@Slf4j
public class MainController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/index")
    public String welcomeIndex(){
        log.info("测试日志！");
        return "hello java";
    }


    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        log.info("applicationName:"+applicationName);
        return this.discoveryClient.getInstances(applicationName);
    }


}
