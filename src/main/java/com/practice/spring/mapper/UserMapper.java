package com.practice.spring.mapper;

import java.util.List;

import com.practice.spring.domain.UserVO;
import com.practice.spring.domain.entity.UserEntity;

public interface UserMapper {

    Integer deleteByPrimaryKey(String userId);

    Integer insert(UserEntity record);

    UserEntity selectByPrimaryKey(String userId);

    List<UserEntity> selectAll();

    Integer updateByPrimaryKey(UserEntity record);

    UserVO read(String userId);

}