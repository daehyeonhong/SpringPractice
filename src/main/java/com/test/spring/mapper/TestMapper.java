package com.test.spring.mapper;

import org.apache.ibatis.annotations.Param;

public interface TestMapper {

    Integer validateYesNo(@Param("yesNoId") String yesNoId);

}