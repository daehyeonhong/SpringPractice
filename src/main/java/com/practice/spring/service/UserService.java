package com.practice.spring.service;

import com.practice.spring.domain.UserVO;
import com.practice.spring.domain.entity.UserEntity;

public interface UserService {

    Integer insert(UserEntity userEntity);

    UserVO selectByPrimaryKey(String userId);

    Integer updateByPrimaryKey(UserEntity userEntity);

}