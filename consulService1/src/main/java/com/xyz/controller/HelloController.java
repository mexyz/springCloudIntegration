package com.xyz.controller;

import com.xyz.service.ConsulService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private ConsulService2 consulService2;
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "aaaaaaaaaa");
        return map;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/returnFromService2")
    public Map<String, String> returnFromService2() {
        return consulService2.returnFromService2();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/returnFromService1")
    public Map<String, String> hello2() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "returnFromService1");
        return map;
    }
}
