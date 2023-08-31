package com.orangezax.helloworld.controller;

import com.orangezax.helloworld.entity.UserInfo;
import com.orangezax.helloworld.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/db/user")
    public List<UserInfo> query() {
        List<UserInfo> users = userMapper.find();
        System.out.println(users);
        return users;
    }

    @PostMapping("/db/insert")
    public int insert(UserInfo user) {

        return 1;
    }
}
