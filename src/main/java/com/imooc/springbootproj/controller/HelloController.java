package com.imooc.springbootproj.controller;

import com.imooc.springbootproj.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping(value = "/user")
    public User user(){
        return new User();
    }


}
