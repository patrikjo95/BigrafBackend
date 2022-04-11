package com.example.bigrafbackend;


import com.example.bigrafbackend.Movies.MoviesService;
import com.example.bigrafbackend.Staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BiografBackendApplication {

    @Autowired
    StaffService staffService;
    MoviesService moviesService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BiografBackendApplication.class, args);

        StaffService staffService = context.getBean(StaffService.class);
        MoviesService moviesService = context.getBean(MoviesService.class);
    }

}
