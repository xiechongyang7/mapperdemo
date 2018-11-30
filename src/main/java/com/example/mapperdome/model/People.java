package com.example.mapperdome.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Description
 * @Since JDK1.8
 * @Createtime 2018/11/30 16:50
 * @Author xie
 */

@Document(collection = "people")
public class People {

    @Id
    @Indexed
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
