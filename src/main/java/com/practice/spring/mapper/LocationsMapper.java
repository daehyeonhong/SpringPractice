package com.practice.spring.mapper;

import java.util.List;
import com.practice.spring.domain.entity.LocationsEntity;

public interface LocationsMapper {

    int deleteByPrimaryKey(Short locationId);

    int insert(LocationsEntity record);

    LocationsEntity selectByPrimaryKey(Short locationId);

    List<LocationsEntity> selectAll();

    int updateByPrimaryKey(LocationsEntity record);

}