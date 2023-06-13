package com.company.myapplication.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 12.06.2023
 */

@Configuration
@EnableJpaRepositories({"com.company.myapplication.repository"})
public class DatabaseConfiguration {

    Environment environment;

    public DatabaseConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean(name = "dataSource")
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        return dataSource;
    }
}