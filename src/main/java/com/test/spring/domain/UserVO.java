package com.test.spring.domain;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

import com.test.spring.domain.entity.UsersEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO extends UsersEntity {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth_date;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date user_reg_date;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date user_update;

    private List<AuthVO> authList;

}