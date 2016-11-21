package com.lkl.springcloud.config.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/customers")
public class CustomerController {
	
	
	@RequestMapping("/customer/{name}")
    public String user(@PathVariable String name){
        return "Hello " + name;
    }
}
