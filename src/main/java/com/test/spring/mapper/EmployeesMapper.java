package com.test.spring.mapper;

import com.test.spring.domain.Employees;
import java.util.List;

public interface EmployeesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int deleteByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int insert(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    Employees selectByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    List<Employees> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbg.generated Sat Mar 13 20:21:58 KST 2021
     */
    int updateByPrimaryKey(Employees record);
}