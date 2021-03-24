package com.practice.spring.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.practice.spring.domain.UserVO;

import lombok.Getter;

@Getter
public class UserImpl extends User {

    private static final long serialVersionUID = 1L;

    private UserVO userVO;

    public UserImpl(String userId, String userPassword, Collection<? extends GrantedAuthority> authorities) {
        super(userId, userPassword, authorities);
    }

    public UserImpl(UserVO userVO) {
        super(userVO.getUserId(), userVO.getUserPassword(), userVO.getAuthList().stream()
                .map(auth -> new SimpleGrantedAuthority(auth.getAuthority())).collect(Collectors.toList()));

        this.userVO = userVO;
    }

}