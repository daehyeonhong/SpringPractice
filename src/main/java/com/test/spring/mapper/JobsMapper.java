package com.test.spring.mapper;

import com.test.spring.domain.Jobs;
import java.util.List;

public interface JobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOBS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int deleteByPrimaryKey(String jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOBS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int insert(Jobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOBS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    Jobs selectByPrimaryKey(String jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOBS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    List<Jobs> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JOBS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int updateByPrimaryKey(Jobs record);
}