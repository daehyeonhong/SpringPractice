package com.test.spring.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthVO {

    private String user_id;
    private String authority;

}