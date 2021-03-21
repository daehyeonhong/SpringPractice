package com.test.spring.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import lombok.extern.slf4j.Slf4j;
import com.test.spring.domain.UserVO;
import com.test.spring.mapper.UserMapper;
import com.test.spring.security.domain.UserImpl;

@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        log.warn("Load User By UserId ==> {}", userId);

        /* userName means user_id */
        UserVO userVO = userMapper.read(userId);

        log.warn("Queried by Member Mapper ==> {}", userVO);

        return userVO == null ? null : new UserImpl(userVO);
    }

}