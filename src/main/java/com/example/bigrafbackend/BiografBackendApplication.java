package com.example.bigrafbackend;


import com.example.bigrafbackend.Movies.MoviesService;
import com.example.bigrafbackend.Staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@SpringBootApplication
@Configuration
public class BiografBackendApplication {

    @Autowired
    StaffService staffService;
    @Autowired
    MoviesService moviesService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BiografBackendApplication.class, args);

        StaffService staffService = context.getBean(StaffService.class);
        MoviesService moviesService = context.getBean(MoviesService.class);
    }

}
