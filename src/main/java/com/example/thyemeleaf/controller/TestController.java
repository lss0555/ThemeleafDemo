package com.example.thyemeleaf.controller;

import com.example.thyemeleaf.model.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "hello world";
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @GetMapping("login")
    public String login (user user){
        System.out.println("用户信息:"+user.toString());
        return "";
    }
}
