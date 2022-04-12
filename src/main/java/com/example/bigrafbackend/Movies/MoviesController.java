package com.example.bigrafbackend.Movies;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MoviesController {

    @Autowired
    MoviesService moviesService;

    @GetMapping("/addMovie")
    public void addMovie(){
        //moviesService.addMovie();
    }

    @GetMapping("/returnMovieSchema")
    public String returnMovieSchema(@RequestParam(value = "Moviename") String moviename){
        Movies movies = new Movies(moviename);

        Map result = moviesService.returnMovieSchema(movies);


        System.out.println(result);

        Gson gson = new Gson();
        String moviesAsString = gson.toJson(movies);

        return moviesAsString;

    }

}
