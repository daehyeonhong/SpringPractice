package com.practice.spring.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        log.warn("Login Success");

        List<String> roleNames = new ArrayList<String>();

        authentication.getAuthorities().forEach(authority -> {
            roleNames.add(authority.getAuthority());
        });

        log.warn("ROLE NAMES ==> {}", roleNames);

        response.sendRedirect(roleNames.contains("ROLE_ADMIN") ? "/user/admin"
                : roleNames.contains("ROLE_MEMBER") ? "/user/member" : "/");
    }

}