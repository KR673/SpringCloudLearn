package com.learn.feign.controller;

import com.learn.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignController {

    @Autowired
    UserService userService;

    @GetMapping("/getname")
    public String getname(){
       return userService.getName();
    }
}
