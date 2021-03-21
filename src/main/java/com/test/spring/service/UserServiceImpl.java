package com.test.spring.service;

import org.springframework.stereotype.Service;

import com.test.spring.domain.entity.UserEntity;
import com.test.spring.mapper.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public Integer insert(UserEntity userEntity) {
        return userMapper.insert(userEntity);
    }

}