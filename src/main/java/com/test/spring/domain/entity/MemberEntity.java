package com.test.spring.domain.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberEntity {

    private String memberId;

    private String memberPassword;

    private String memberName;

    private String memberNickname;

    private Date birthDate;

    private String memberEmail;

    private String memberPhone;

    private String license;

    private Date memberRegdate;

    private Date memberUpdate;

    private String enabled;

}