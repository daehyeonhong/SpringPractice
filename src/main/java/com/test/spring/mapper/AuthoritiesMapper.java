package com.test.spring.mapper;

import java.util.List;
import com.test.spring.domain.entity.AuthoritiesEntity;

public interface AuthoritiesMapper {

    int insert(AuthoritiesEntity record);

    List<AuthoritiesEntity> selectAll();

}