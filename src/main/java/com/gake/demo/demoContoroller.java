package com.gake.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class demoContoroller {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/time")
    public LocalDateTime time() {

        return LocalDateTime.now();
    }

    @GetMapping("/time2")
    public String time2() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return ("今の時間は：" + now.format(f) + " です。");
    }


}


