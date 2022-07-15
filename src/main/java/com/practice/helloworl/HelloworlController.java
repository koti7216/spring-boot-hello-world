package com.practice.helloworl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworlController {
    @RequestMapping
    public String hellowour() {
        return "HELLO WORLD FROM SPRING BOOT";
    }
    @RequestMapping("/chinna")
    public String chinna(){
        return " hii ra chinna";
    }
}
