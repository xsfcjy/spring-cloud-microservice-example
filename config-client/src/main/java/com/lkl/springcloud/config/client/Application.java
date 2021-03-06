package com.lkl.springcloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaokailin on 16/4/28.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
@RestController
@RefreshScope
public class Application {

    @Value("${name:World!}") String name ;
    
    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/home")
    public String home(){
    	ServiceInstance instance = client.getLocalServiceInstance();
    	System.out.println(instance.getHost());
        return "Hello " + name;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
