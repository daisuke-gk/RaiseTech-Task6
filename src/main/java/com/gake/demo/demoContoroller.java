package com.gake.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoContoroller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
