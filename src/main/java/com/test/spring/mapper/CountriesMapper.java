package com.test.spring.mapper;

import com.test.spring.domain.Countries;
import java.util.List;

public interface CountriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNTRIES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int deleteByPrimaryKey(String countryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNTRIES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int insert(Countries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNTRIES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    Countries selectByPrimaryKey(String countryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNTRIES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    List<Countries> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNTRIES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int updateByPrimaryKey(Countries record);
}