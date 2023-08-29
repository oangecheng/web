package com.orangezax.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // http://www.baidu.com/hello
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    @GetMapping("/username")
    public String getUserName() {
        return "我是橙子";
    }
}
