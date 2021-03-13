package com.test.spring.domain;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {

    private String user_id;
    private String user_password;
    private String user_name;
    private String user_nickname;
    private String user_email;
    private String user_phone;
    private String license;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date user_reg_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date user_update;

    private boolean enabled;

    private List<AuthVO> authList;

}