package com.test.spring.mapper;

import com.test.spring.domain.UserVO;
import com.test.spring.domain.entity.UserEntity;
import java.util.List;

public interface UserMapper {

    Integer deleteByPrimaryKey(String userId);

    Integer insert(UserEntity record);

    UserEntity selectByPrimaryKey(String userId);

    List<UserEntity> selectAll();

    Integer updateByPrimaryKey(UserEntity record);

    UserVO read(String userId);

}