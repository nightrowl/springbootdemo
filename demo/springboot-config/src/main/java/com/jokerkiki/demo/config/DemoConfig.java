package com.jokerkiki.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 70719
 */
@Configuration
public class DemoConfig {

    @Bean
    public String demo(){
        return "test demo";
    }
}
