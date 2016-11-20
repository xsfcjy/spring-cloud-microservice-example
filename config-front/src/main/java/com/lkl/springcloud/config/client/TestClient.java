package com.lkl.springcloud.config.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("foo")
public interface TestClient {
	
	@RequestMapping("/home")
    public String home();
}
