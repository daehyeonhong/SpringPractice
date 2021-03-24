package com.practice.spring.service;

import org.springframework.stereotype.Service;
import com.practice.spring.domain.UserVO;
import com.practice.spring.domain.entity.UserEntity;
import com.practice.spring.mapper.UserMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public Integer insert(UserEntity userEntity) {
        return userMapper.insert(userEntity);
    }

    @Override
    public UserVO selectByPrimaryKey(String userId) {
        return (UserVO) userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Integer updateByPrimaryKey(UserEntity userEntity) {
        return userMapper.updateByPrimaryKey(userEntity);
    }

}