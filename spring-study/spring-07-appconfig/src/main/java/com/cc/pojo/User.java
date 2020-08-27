package com.cc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 加上这个注解，被spring托管了
 */
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("chengzi")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
