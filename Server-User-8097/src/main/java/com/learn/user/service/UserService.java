package com.learn.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    public String getFeign(){
        return restTemplate.getForObject("http://FEIGN-SERVER/getFeign", String.class);
    }

}
