package com.xyz.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class ConsulService2Hystrix implements ConsulService2{
    @Override
    public Map<String, String> returnFromService2() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "returnFromService2  eeeeeeeeeeeeeeeeeeeeeee");
        return map;
    }
}
