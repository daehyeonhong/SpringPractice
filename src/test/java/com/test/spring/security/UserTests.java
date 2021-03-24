package com.test.spring.security;

import java.util.Date;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import com.practice.spring.domain.entity.UserEntity;
import com.practice.spring.service.UserService;
import com.test.spring.config.JUnitTestConfig;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Rollback
public class UserTests extends JUnitTestConfig {

    @Setter(onMethod_ = @Autowired)
    private UserService userService;

    @Setter(onMethod_ = @Autowired)
    private PasswordEncoder passwordEncoder;

    @Test
    public void registMember() {
        for (int i = 0; i < 100; i++) {
            UserEntity UserEntity = new UserEntity();
            UserEntity.setUserId("test" + i);
            UserEntity.setUserPassword(passwordEncoder.encode("test" + i));
            UserEntity.setUserName("test" + i);
            UserEntity.setUserNickname("TEST" + i);
            UserEntity.setBirthDate(new Date());
            UserEntity.setUserEmail("test" + i + "@gmail.com");
            UserEntity.setUserPhone("010-1234-4321" + i);
            UserEntity.setLicense("1lkqi" + i);
            log.info("{}", UserEntity);
            Integer result = userService.insert(UserEntity);
            log.info("result : {}", result > 0 ? "Succese" : "Failure");
        }
    }

}