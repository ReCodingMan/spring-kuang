package com.cc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 等价于 <bean id="user" class="com.cc.pojo.User"/>
 */
@Component
@Scope("singleton")
public class User {

    //相当于<property name="name" value="chengzi2"/>
    @Value("chengzi22")
    public String name = "橙子";
}
