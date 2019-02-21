package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.property.DemoProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Autowired
    DemoProperty demoProperty;

    @RequestMapping("/api/demo")
    public String demo(){
        return "hello world ,this is id = :" + demoProperty.getId() + " and name = "+demoProperty.getName();
    }
}
