package com.orangezax.helloworld.controller;

import com.orangezax.helloworld.data.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    // http://www.baidu.com/hello
    // http://localhost:8080/hello?nickname=zhangsan&number=123
    // @RequestParam 加了之后参数必须传递，不传递 required 字段标记 false
    @GetMapping("/hello")
    public String hello(String nickname, @RequestParam(value = "number", required = false) String num) {
        return "Hello World " + nickname + num;
    }


    @GetMapping("/username")
    public String getUserName() {
        return "我是橙子";
    }

    @RequestMapping("/user")
    public User getUser() {
        User user = new User();
        user.username = "orange";
        user.password = "1232";
        return user;
    }

    @PostMapping("/posttest")
    public String postTest(String username, String password) {
        System.out.println(username);
        return password;
    }

    // body类型 url encode
    @PostMapping("/post/body")
    public String postBody(User user) {
        return  user.username;
    }

    // 前端传 json类型
    @PostMapping("/post/body2")
    public String postBody2(@RequestBody User user) {
        return  user.username;
    }

    @GetMapping("love")
    public String love() {
        return "夏文欣是我的小宝贝！";
    }
}

