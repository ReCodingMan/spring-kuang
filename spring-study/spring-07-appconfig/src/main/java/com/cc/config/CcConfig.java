package com.cc.config;

import com.cc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.cc.pojo")
@Import({CcConfig2.class})
public class CcConfig {
}
