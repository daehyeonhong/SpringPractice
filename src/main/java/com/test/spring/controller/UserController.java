package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/user")
public class UserController {

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

}