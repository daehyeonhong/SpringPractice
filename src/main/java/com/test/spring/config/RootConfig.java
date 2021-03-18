package com.test.spring.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Setter;

@Configuration
@ComponentScan(basePackages = { "com.test.spring.service" }, includeFilters = @Filter({ Controller.class, Service.class }), useDefaultFilters = false)
@EnableAspectJAutoProxy
@EnableTransactionManagement
@MapperScan(basePackages = { "com.test.spring.mapper" })
@PropertySource(value = { "classpath:/com/test/spring/config/database.properties" })
public class RootConfig {

    @Setter(onMethod_ = @Autowired)
    ApplicationContext applicationContext;

    @Value("${dataSource.url}")
    private String jdbcUrl;
    @Value("${dataSource.driverClassName}")
    private String driverClassName;
    @Value("${dataSource.user}")
    private String user;
    @Value("${dataSource.password}")
    private String password;
    @Value("${hikari.connectionTestQuery}")
    private String connecttionTestQuery;
    @Value("${hikari.maximumPoolSize}")
    private int maximumPoolSize;
    @Value("${hikari.idleTimeout}")
    private long idleTimeout;
    @Value("${hikari.maxLifetime}")
    private long maxLifeTime;
    @Value("${hikari.connectionTimeout}")
    private long connectionTimeout;

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setUsername(user);
        hikariConfig.setPassword(password);
        hikariConfig.setConnectionTestQuery(connecttionTestQuery);
        hikariConfig.setMaximumPoolSize(maximumPoolSize);
        hikariConfig.setIdleTimeout(idleTimeout);
        hikariConfig.setMaxLifetime(maxLifeTime);
        hikariConfig.setConnectionTimeout(connectionTimeout);
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(applicationContext.getResource("classpath:/com/test/spring/config/mybatis-config.xml"));
        return (SqlSessionFactory) sqlSessionFactory.getObject();
    }

    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}