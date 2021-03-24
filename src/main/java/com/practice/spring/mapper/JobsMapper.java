package com.practice.spring.mapper;

import java.util.List;

import com.practice.spring.domain.entity.JobsEntity;

public interface JobsMapper {

    int deleteByPrimaryKey(String jobId);

    int insert(JobsEntity record);

    JobsEntity selectByPrimaryKey(String jobId);

    List<JobsEntity> selectAll();

    int updateByPrimaryKey(JobsEntity record);

}