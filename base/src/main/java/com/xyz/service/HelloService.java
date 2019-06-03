package com.xyz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient("consul-client")
public interface HelloService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    Map<String, String> sayHello();
}
