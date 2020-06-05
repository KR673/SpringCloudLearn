package com.learn.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 调用User模块的controller层接口
 * @Author: WangXiaoBo
 * @Date: 2020/6/5
 */
@FeignClient(value = "user-server")
public interface UserService {

    @GetMapping("/user/getName")
    String getName();

}
