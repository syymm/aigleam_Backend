package com.example.aigleam.controller;

import com.example.aigleam.data.Result;
import com.example.aigleam.data.UserData;
import com.example.aigleam.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody UserData userData) {
        return loginService.login(userData);
    }
}
