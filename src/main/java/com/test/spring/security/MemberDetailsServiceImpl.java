package com.test.spring.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import lombok.extern.slf4j.Slf4j;
import com.test.spring.domain.MemberVO;
import com.test.spring.mapper.MemberMapper;
import com.test.spring.security.domain.MemberImpl;

@Slf4j
public class MemberDetailsServiceImpl implements UserDetailsService {

    private MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String MemberId) throws UsernameNotFoundException {

        log.warn("Load Member By MemberId ==> {}", MemberId);

        /* userName means user_id */
        MemberVO vo = memberMapper.read(MemberId);

        log.warn("Queried by Member Mapper ==> {}", vo);

        return vo == null ? null : new MemberImpl(vo);
    }

}