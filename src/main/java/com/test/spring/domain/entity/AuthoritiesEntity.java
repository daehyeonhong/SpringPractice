package com.test.spring.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthoritiesEntity {

    private String memberId;

    private String authority;

}