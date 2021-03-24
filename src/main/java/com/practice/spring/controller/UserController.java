package com.practice.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.spring.domain.entity.UserEntity;
import com.practice.spring.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;

    @GetMapping(value = "/login")
    public void login() {
        log.info("login");
    }

    @GetMapping(value = "/forgotPassword")
    public void forgotPassword() {
        log.info("forgotPassword");
    }

    @GetMapping(value = "/register")
    public void register() {
        log.info("register");
    }

    @PostMapping(value = "/register")
    public String register(UserEntity userEntity) {
        log.info("register : {}", userEntity);
        return userService.insert(userEntity) > 0 ? "/user/login" : "/user/register";
    }

}