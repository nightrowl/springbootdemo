package com.jokerkiki.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/api/demo")
    public String demo(){
        System.out.println(restTemplate);
        String returnResult = restTemplate.getForObject("http://localhost:8080/api/test/{id}",String.class,1);
        return returnResult;
    }

    @RequestMapping("/api/test/{id}")
    public String testRest(@PathVariable Long id){
        System.out.println(id);
        return "success";
    }
}
