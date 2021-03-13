package com.test.spring.mapper;

import com.test.spring.domain.Regions;
import java.util.List;

public interface RegionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int deleteByPrimaryKey(Short regionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int insert(Regions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    Regions selectByPrimaryKey(Short regionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    List<Regions> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int updateByPrimaryKey(Regions record);
}