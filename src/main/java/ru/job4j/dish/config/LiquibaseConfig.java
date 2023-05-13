package ru.job4j.dish.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class LiquibaseConfig {

//    private final DataSource ds;
//
//    public LiquibaseConfig(DataSource ds) {
//        this.ds = ds;
//    }

//    @Bean
    public SpringLiquibase liquibase() {
//        SpringLiquibase liquibase = new SpringLiquibase();
//        liquibase.setChangeLog("classpath:db/dbchangelog.xml");
       // liquibase.setDataSource(ds);
//        return liquibase;
        return null;
    }
}
