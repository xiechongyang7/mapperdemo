package com.example.mapperdome.controller;

import com.example.mapperdome.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Since JDK1.8
 * @Createtime 2018/11/30 14:53
 * @Author xie
 */
@RestController
public class TestController {

    @Autowired
    private Test test;

    @GetMapping(value = "/info")
    public Object get(){
        return test.foo();
    }

    @GetMapping(value = "/page/{a}/{b}")
    public Object get(@PathVariable String a,@PathVariable String b){
        return test.foo2(a,b);
    }

    @GetMapping(value = "/test")
    public Object test(){
        return test.foo3();
    }
}
