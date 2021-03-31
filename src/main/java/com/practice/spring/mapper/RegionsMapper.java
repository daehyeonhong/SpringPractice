package com.practice.spring.mapper;

import java.util.List;
import com.practice.spring.domain.entity.RegionsEntity;

public interface RegionsMapper {

    int deleteByPrimaryKey(Short regionId);

    int insert(RegionsEntity record);

    RegionsEntity selectByPrimaryKey(Short regionId);

    List<RegionsEntity> selectAll();

    int updateByPrimaryKey(RegionsEntity record);

}