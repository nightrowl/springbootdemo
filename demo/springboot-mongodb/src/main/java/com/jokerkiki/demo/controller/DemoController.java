package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.entity.Baike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("/api/demo")
    public String addDemo(@RequestBody Baike baike){
        mongoTemplate.insert(baike);
        return "success";
    }
}
