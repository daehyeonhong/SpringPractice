package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.spring.domain.entity.MemberEntity;
import com.test.spring.service.MemberService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/member")
public class MemberController {

    private MemberService memberService;

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
    public String register(MemberEntity memberEntity) {
        log.info("register : {}", memberEntity);
        return memberService.insert(memberEntity) > 0 ? "/member/login" : "/member/register";
    }

}