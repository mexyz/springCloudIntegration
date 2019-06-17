package com.xyz.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ConsulService1Hystrix implements ConsulService1 {
    @Override
    public Map<String, String> returnFromService1() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "returnFromService1  eeeeeeeeeeeeeeeeeeeeeee");
        return map;
    }
}
