package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.entity.DemoConfig;
import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/api/demo/{id}")
    public String demo(@PathVariable Long id ){
    DemoConfig demoConfig = (DemoConfig) demoService.findConfigById(id);
        return demoConfig.toString();
    }

    @RequestMapping("/api/demo/add")
    public String addDemo(@RequestBody DemoConfig demoConfig){
        int total = demoService.addConfig(demoConfig);
        return String.valueOf(total);
    }
    @RequestMapping("/api/demo/update")
    public String updateDemo(@RequestBody DemoConfig demoConfig){
        int total = demoService.updateConfig(demoConfig);
        return String.valueOf(total);
    }
    @RequestMapping("/api/demo/delete/{id}")
    public String deleteDemo(@PathVariable Long id ){
        int total = demoService.deleteConfig(id);
        return String.valueOf(total);
    }


    @RequestMapping("/api/demo/cluster/{id}")
    public String demoCluster(@PathVariable Long id ){
        DemoConfig demoConfig = (DemoConfig) demoService.findClusterConfigById(id);
        return demoConfig.toString();
    }

    @RequestMapping("/api/demo/add/cluster")
    public String addDemoCluster(@RequestBody DemoConfig demoConfig){
        int total = demoService.addClusterConfig(demoConfig);
        return String.valueOf(total);
    }
    @RequestMapping("/api/demo/update/cluster")
    public String updateDemoCluster(@RequestBody DemoConfig demoConfig){
        int total = demoService.updateClusterConfig(demoConfig);
        return String.valueOf(total);
    }
    @RequestMapping("/api/demo/delete/cluster/{id}")
    public String deleteDemoCluster(@PathVariable Long id ){
        int total = demoService.deleteClusterConfig(id);
        return String.valueOf(total);
    }


}
