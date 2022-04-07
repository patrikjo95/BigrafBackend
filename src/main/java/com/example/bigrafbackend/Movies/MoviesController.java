package com.example.bigrafbackend.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class MoviesController {

    @Autowired
    MoviesService moviesService;

    @GetMapping("/addMovie")
    public void addMovie(){


    }

}
