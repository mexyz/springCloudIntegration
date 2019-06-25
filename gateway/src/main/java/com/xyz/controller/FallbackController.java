package com.xyz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Map<String, String> fallback() {
        Map<String, String> map = new HashMap<>();
        map.put("result", "服务异常");
        return map;
    }

    @HystrixCommand(commandKey = "fallbackcmd")
    public Map<String, String> fallbackCmd() {
        Map<String, String> map = new HashMap<>();
        map.put("result", "fallbackcmd");
        return map;
    }
}
