package com.test.spring.mapper;

import com.test.spring.domain.Locations;
import java.util.List;

public interface LocationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOCATIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int deleteByPrimaryKey(Short locationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOCATIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int insert(Locations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOCATIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    Locations selectByPrimaryKey(Short locationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOCATIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    List<Locations> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOCATIONS
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int updateByPrimaryKey(Locations record);
}