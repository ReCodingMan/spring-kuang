package com.cc.config;

import com.cc.pojo.User;
import org.springframework.context.annotation.Bean;

public class CcConfig2 {

    @Bean
    public User getUser() {
        return new User();
    }
}
