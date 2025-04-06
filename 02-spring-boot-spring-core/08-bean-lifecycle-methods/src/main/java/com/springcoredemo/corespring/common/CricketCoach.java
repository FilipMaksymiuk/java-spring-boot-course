package com.springcoredemo.corespring.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor "+ getClass().getSimpleName() );
    }

    //define init method
    @PostConstruct
    public void doMyStuff(){
        System.out.println("I do my start up stuff "+ getClass().getSimpleName());
    }
    //define destroy method

    @PreDestroy
    public void cleanMyStuff(){
        System.out.println("I do my clean up stuff "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
