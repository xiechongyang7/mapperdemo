package com.example.mapperdome.controller;

import com.example.mapperdome.service.MongodbTest;
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

    @Autowired
    private MongodbTest mongodbTest;

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

    @GetMapping(value = "/add")
    public Object add(){
        return mongodbTest.add();
    }
    @GetMapping(value = "/del")
    public Object del(){
        return mongodbTest.del();
    }
    @GetMapping(value = "/up")
    public Object up(){
        return mongodbTest.up();
    }
    @GetMapping(value = "/query")
    public Object query(){
        return mongodbTest.query();
    }
}
