package com.lkl.springcloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaokailin on 16/4/28.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan
@RestController
@RefreshScope
public class Application {

    @Autowired
    TestClient testClient;
    
    @RequestMapping("/test")
    public String test(){
        return testClient.home();
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
