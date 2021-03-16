package com.test.spring.mapper;

import java.util.List;
import com.test.spring.domain.entity.UsersEntity;

public interface UsersMapper {

    int deleteByPrimaryKey(String userId);

    int insert(UsersEntity record);

    UsersEntity selectByPrimaryKey(String userId);

    List<UsersEntity> selectAll();

    int updateByPrimaryKey(UsersEntity record);

}