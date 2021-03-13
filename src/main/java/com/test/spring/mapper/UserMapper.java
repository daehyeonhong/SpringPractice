package com.test.spring.mapper;

import com.test.spring.domain.UserVO;

public interface UserMapper {

    public UserVO read(String user_id);

    public void register(UserVO userVO);

}