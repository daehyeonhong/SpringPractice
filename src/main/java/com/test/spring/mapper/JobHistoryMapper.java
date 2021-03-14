package com.test.spring.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.test.spring.domain.entity.JobHistoryEntity;

public interface JobHistoryMapper {

    int deleteByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("startDate") Date startDate);

    int insert(JobHistoryEntity record);

    JobHistoryEntity selectByPrimaryKey(@Param("employeeId") Integer employeeId, @Param("startDate") Date startDate);

    List<JobHistoryEntity> selectAll();

    int updateByPrimaryKey(JobHistoryEntity record);

}