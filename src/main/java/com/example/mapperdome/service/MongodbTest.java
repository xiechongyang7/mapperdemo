package com.example.mapperdome.service;

import com.example.mapperdome.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Since JDK1.8
 * @Createtime 2018/11/30 16:59
 * @Author xie
 */
@Service
public class MongodbTest {

    @Autowired
    private MongoTemplate mongoTemplate;


    public int add(){
        People people = new People();
        people.setId(1);
        people.setName("shi");
        mongoTemplate.insert(people);
        return 1;
    }


    public int del(){
        People people = new People();
        people.setId(1);
        mongoTemplate.remove(people);
        return 1;
    }


    public int up(){
        Query query = new Query(Criteria.where("id").is(1));
        Update update = new Update();
        update.set("name", "chusheng");
        mongoTemplate.updateFirst(query, update, People.class);
        return 1;
    }


    public People query(){
        Query query = new Query(Criteria.where("id").is(1));
        People people = mongoTemplate.findOne(query, People.class);
        return people;
    }


}
