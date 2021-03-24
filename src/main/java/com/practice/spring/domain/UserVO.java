package com.practice.spring.domain;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

import com.practice.spring.domain.entity.UserEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO extends UserEntity {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userRegdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userUpdate;

    private List<AuthVO> authList;

}