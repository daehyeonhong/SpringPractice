package com.test.spring.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import lombok.Getter;
import com.test.spring.domain.MemberVO;

@Getter
public class MemberImpl extends User {

    private static final long serialVersionUID = 1L;

    private MemberVO MemberVO;

    public MemberImpl(String memberId, String userPassword, Collection<? extends GrantedAuthority> authorities) {
        super(memberId, userPassword, authorities);
    }

    public MemberImpl(MemberVO vo) {
        super(vo.getMemberId(), vo.getMemberPassword(), vo.getAuthList().stream()
                .map(auth -> new SimpleGrantedAuthority(auth.getAuthority())).collect(Collectors.toList()));

        this.MemberVO = vo;
    }

}