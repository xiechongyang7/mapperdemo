package com.example.mapperdome.mapper;

import com.example.mapperdome.MyMapper;
import com.example.mapperdome.model.User;
import org.apache.ibatis.annotations.Update;

public interface UserMapper extends MyMapper<User> {


    @Update("UPDATE ${homeaddress} SET userName =#{username} WHERE (id=#{id});\n")
    int update1(User user);
}