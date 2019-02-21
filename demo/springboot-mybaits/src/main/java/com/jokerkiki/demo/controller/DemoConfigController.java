package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.service.DemoConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 70719
 *
 */
@RestController
public class DemoConfigController {

    @Autowired
    DemoConfigService demoConfigService;

    @RequestMapping("/api/demo")
    public String demo(@RequestParam Long id){
        return demoConfigService.findById(id).toString();
    }

}
