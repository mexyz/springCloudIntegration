package com.xyz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "consul-client2", fallback = ConsulService2Hystrix.class)
public interface ConsulService2 {

    @RequestMapping(method = RequestMethod.GET, value = "/returnFromService2")
    Map<String, String> returnFromService2();
}
