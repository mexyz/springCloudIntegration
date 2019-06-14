package com.xyz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("text", "bbbbbbbbbbb");
        return map;
    }
}
