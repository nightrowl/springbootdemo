package com.jokerkiki.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/api/test")
    public String demo(@RequestParam String name){
        stringRedisTemplate.opsForValue().set("qqqq",name);
        String returnName = stringRedisTemplate.opsForValue().get("qqqq");
        return returnName;
    }
}
