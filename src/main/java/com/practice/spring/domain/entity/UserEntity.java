package com.practice.spring.domain.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserEntity {

    private String userId;

    private String userPassword;

    private String enabled;

    private String userName;

    private String userNickname;

    private Date birthDate;

    private String userEmail;

    private String userPhone;

    private String license;

    private Date userRegdate;

    private Date userUpdate;

}