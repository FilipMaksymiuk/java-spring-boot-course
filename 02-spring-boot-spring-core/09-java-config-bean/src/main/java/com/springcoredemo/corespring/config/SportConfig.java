package com.springcoredemo.corespring.config;

import com.springcoredemo.corespring.common.Coach;
import com.springcoredemo.corespring.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
