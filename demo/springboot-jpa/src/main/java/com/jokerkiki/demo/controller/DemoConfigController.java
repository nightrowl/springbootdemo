package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.entity.DemoConfig;
import com.jokerkiki.demo.service.DemoConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author 70719
 *
 */
@RestController
public class DemoConfigController {

    @Autowired
    DemoConfigService demoConfigService;

    @RequestMapping("/api/demo/{id}")
    public String demo(@PathVariable Long id){
        return demoConfigService.findById(id).toString();
    }

    @RequestMapping("/api/demo/add")
    public int addDemo(@RequestBody DemoConfig demoConfig){
        return demoConfigService.addDemoConfig(demoConfig);
    }

    @RequestMapping("/api/demo/update")
    public int updateDemo(@RequestBody DemoConfig demoConfig){
        return demoConfigService.updateDemoConfig(demoConfig);
    }

    @RequestMapping("/api/demo/delete/{id}")
    public int deleteDemo(@PathVariable Long id){
        return demoConfigService.deleteDemoConfig(id);
    }
}
