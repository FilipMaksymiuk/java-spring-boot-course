package com.springbotproject.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestConroller {

    @Value("${coach.name}")
    private String coach;
    @Value("${club.name}")
    private String team;

    @GetMapping("/teaminfo")
    public String getinfo(){
        return "Coach :"+ coach +", club: "+ team;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/nowyRest")
    public String nowyRest(){
        return "Kamila patrz na to!";
    }

}
