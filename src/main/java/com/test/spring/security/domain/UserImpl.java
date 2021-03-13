package com.test.spring.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import lombok.Getter;
import com.test.spring.domain.UserVO;

@Getter
public class UserImpl extends User {

    private static final long serialVersionUID = 1L;

    private UserVO userVO;

    public UserImpl(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public UserImpl(UserVO vo) {
        super(vo.getUser_id(), vo.getUser_password(), vo.getAuthList().stream()
                .map(auth -> new SimpleGrantedAuthority(auth.getAuthority())).collect(Collectors.toList()));

        this.userVO = vo;
    }

}