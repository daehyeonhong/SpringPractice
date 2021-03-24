package com.practice.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LogAdvice {

    @Before("execution(* com.practice.spring.service.")
    public void logBefore() {
        log.info("before");
    }

}