package com.lkl.springcloud.config.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/users")
public class UserController {
	
	
	@RequestMapping("/user/{id}")
    public String user(@PathVariable String id){
        return "Hello " + id;
    }
}
