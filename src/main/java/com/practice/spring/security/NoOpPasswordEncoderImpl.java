package com.practice.spring.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoOpPasswordEncoderImpl implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {

        log.warn("Before Encode ==> {}", rawPassword);

        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

        log.warn("Matches ==> {} : {}", rawPassword, encodedPassword);

        return rawPassword.toString().equals(encodedPassword);
    }

}
