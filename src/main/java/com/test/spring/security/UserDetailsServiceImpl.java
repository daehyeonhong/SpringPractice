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

    private UserMapper UserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.warn("Load User By UserName ==> {}", username);

        /* userName means user_id */
        UserVO vo = UserMapper.read(username);

        log.warn("Queried by Member Mapper ==> {}", vo);

        return vo == null ? null : new UserImpl(vo);
    }

}