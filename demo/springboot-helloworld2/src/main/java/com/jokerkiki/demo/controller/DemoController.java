package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.entity.Demo;
import com.jokerkiki.demo.entity.ReturnResult;
import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 70719
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    DemoService demoService;
    /**
     * 新增方法，多用于post请求
     */
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public ReturnResult addDemo(@RequestBody Demo demo){
        try{
            return ReturnResult.success(demoService.add(demo));
        }catch(Exception e){
            return ReturnResult.fail("添加失败");
        }
    }

    /**
     * 删除方法
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ReturnResult deleteDemo(@PathVariable Long id){
        try{
            return ReturnResult.success(demoService.delete(id));
        }catch(Exception e){
            return ReturnResult.fail("删除失败");
        }
    }

    /**
     * 修改方法
     * @param demo
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ReturnResult updateDemo(@RequestBody Demo demo){
        try{
            return ReturnResult.success(demoService.update(demo));
        }catch(Exception e){
            return ReturnResult.fail("更新失败");
        }
    }
    /**
     * 查询方法
     * @param demo
     * @return
     */
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public ReturnResult queryDemo(@RequestBody Demo demo){
        try{
            return ReturnResult.success(demoService.query(demo));
        }catch(Exception e){
            return ReturnResult.fail("查询失败");
        }
    }
}
