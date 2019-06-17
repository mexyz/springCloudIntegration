package com.xyz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "consul-client1", fallback = ConsulService1Hystrix.class)
public interface ConsulService1 {

    @RequestMapping(method = RequestMethod.GET, value = "/returnFromService1")
    Map<String, String> returnFromService1();
}
