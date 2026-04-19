package com.demo.Utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

    // Marks this class as configuration class
    @Configuration
    public class DBConfig {

        // Create DataSource Bean
        @Bean
        public DataSource dataSource() {

            // DriverManagerDataSource is used for DB connection
            DriverManagerDataSource ds = new DriverManagerDataSource();

            // MySQL Driver
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

            // DB URL
            ds.setUrl("jdbc:mysql://localhost:3306/empservletdb");

            // DB Username
            ds.setUsername("root");

            // DB Password
            ds.setPassword("admin@123");

            return ds; // return datasource object
        }

        // Create JdbcTemplate Bean
        @Bean
        public JdbcTemplate jdbcTemplate(DataSource dataSource) {
            return new JdbcTemplate(dataSource);
        }
    }


