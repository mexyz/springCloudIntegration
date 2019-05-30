package com.xyz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
public interface HelloService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    void sayHello();
}
