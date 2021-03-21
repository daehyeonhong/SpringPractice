package com.test.spring.security;

import java.util.Date;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import com.test.spring.config.JUnitTestConfig;
import com.test.spring.domain.entity.UserEntity;
import com.test.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Rollback
public class UserTests extends JUnitTestConfig {

    @Autowired
    private UserService userService;

    @Test
    public void registMember() {
        UserEntity UserEntity = new UserEntity();
        UserEntity.setUserId("TestUser");
        UserEntity.setUserPassword("test");
        UserEntity.setUserName("Test");
        UserEntity.setUserNickname("TEST");
        UserEntity.setBirthDate(new Date());
        UserEntity.setUserEmail("test@gmail.com");
        UserEntity.setUserPhone("010-1234-4321");
        UserEntity.setLicense("1lkqi2");
        log.info("{}", UserEntity);
        Integer result = userService.insert(UserEntity);
        log.info("result : {}", result > 0 ? "Succese" : "Failure");
    }

}