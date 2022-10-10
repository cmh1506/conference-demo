package de.code4u.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(dbUrl)
                .username("postgres")
                .password("Welcome");
        System.out.println("Liebling, es ist aus.");
        return builder.build();
    }
}
