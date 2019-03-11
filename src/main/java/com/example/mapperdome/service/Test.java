package com.example.mapperdome.service;

import com.example.mapperdome.mapper.UserMapper;
import com.example.mapperdome.model.People;
import com.example.mapperdome.model.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Since JDK1.8
 * @Createtime 2018/11/22 11:53
 * @Author xie
 */
@Service
public class Test {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> foo(){
        User u = new User();
        u.setUsername("四胖子");
        u.setId(7L);
        u.setHomeaddress("t_user");
        userMapper.update1(u);
        return userMapper.selectAll();
    }

    public List<User> foo2(String a,String b){
        PageHelper.startPage(Integer.valueOf(a), Integer.valueOf(b));
        return userMapper.selectAll();
    }

    public List<User> foo3(){
        User user = new User();
        user.setId(Long.valueOf(7));
        return userMapper.select(user);
    }

}
