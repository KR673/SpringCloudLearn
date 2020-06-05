package com.learn.user.Controller;

import com.learn.user.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getName")
    public String getName(){
        return "user-server-8097";
    }

    @GetMapping("/getFeign")
    public String getFeign(){
        return userService.getFeign();
    }
}
