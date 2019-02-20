package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    /**
     * 请求方式 127.0.0.1:8080/api/demo/first
     * @return
     */
    @RequestMapping("/first")
    public String apiDemoFirst(){

        return "hello world";
    }

    /**
     * 请求方式 127.0.0.1:8080/api/demo/second?id = xxx
     * @param id
     * @return
     */
    @RequestMapping("/second")
    public String apiDemoSecond(@RequestParam String id ){

        return "hello world : " + id;
    }

    /**
     * 请求方式 127.0.0.1:8080/api/demo/secondTwo/123
     * @param id
     * @return
     */
    @RequestMapping("/secondTwo/{id}")
    public String apiDemoSecondTwo(@PathVariable String id ){

        return "hello world : " + id;
    }
    /**
     * post 请求方式 127.0.0.1:8080/api/demo/third   请求头需要application/json
     * @param user
     * @return
     */
    @RequestMapping("/third")
    public String apiDemoThird(@RequestBody User user ){
        return "hello world : " + user;
    }

    /**
     * get/post 请求方式
     * 127.0.0.1:8080/api/demo/forth?id=xxx&&name=xxx
     * post 127.0.0.1:8080/api/demo/forth 请求头不能是json
     * @param user
     * @return
     */
    @RequestMapping("/forth")
    public String apiDemoForth( User user ){
        return "hello world : " + user;
    }
}
