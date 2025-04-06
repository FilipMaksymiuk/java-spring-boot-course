package com.springbotproject.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestConroller {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}
