package com.xyz.controller;

import com.xyz.service.ConsulService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private ConsulService1 consulService1;
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "bbbbbbbbbbbb");
        return map;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/returnFromService2")
    public Map<String, String> hello2() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "returnFromService2");
        return map;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/returnFromService1")
    public Map<String, String> returnFromService2() {
        return consulService1.returnFromService1();
    }
}
