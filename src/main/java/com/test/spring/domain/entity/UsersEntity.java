package com.test.spring.domain.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UsersEntity {

    private String userId;

    private String userPassword;

    private String userName;

    private String userNickname;

    private Date birthDate;

    private String userEmail;

    private String userPhone;

    private String license;

    private Date userRegDate;

    private Date userUpdate;

    private String enabled;

}