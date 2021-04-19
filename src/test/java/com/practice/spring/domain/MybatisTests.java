package com.practice.spring.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.practice.spring.config.JUnitTestConfig;
import com.practice.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MybatisTests extends JUnitTestConfig {

    @Autowired
    private UserService userService;

    @Test
    public void userTest() {
        UserVO userVo = userService.selectByPrimaryKey("123");

        log.info("{}", userVo);
    }

}