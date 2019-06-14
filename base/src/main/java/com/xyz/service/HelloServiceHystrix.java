package com.xyz.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HelloServiceHystrix implements HelloService{

    @Override
    public Map<String, String> sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "eeeeeeeeeeeeeeeeeeeeeee");
        return map;
    }
}
