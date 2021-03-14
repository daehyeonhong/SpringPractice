package com.test.spring.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.junit.Test;
import com.test.spring.config.JUnitTestConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataSourceTests extends JUnitTestConfig {

    @Test
    public void databaseConnectTest() {
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        long start = System.currentTimeMillis();
        try {
            Connection connection = dataSource.getConnection();
            String sql;
            sql = "SELECT*FROM DUAL";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                log.info(resultSet.getString(1));
            }
            long end = System.currentTimeMillis();
            long setDiffTime = (end - start);
            log.info("조회시간: {}초", setDiffTime / 1e3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}