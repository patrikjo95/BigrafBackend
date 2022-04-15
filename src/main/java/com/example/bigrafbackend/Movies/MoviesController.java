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

    /**
     * Metoden addMovie tar parameters från frontenden och skickar in i databasen för att lägga till en ny filmvisning.
     * @param moviename
     * @param dateTime
     * @param theaterId
     * @return
     */
    @GetMapping("/add_movie")
    public String addMovie(@RequestParam(value = "new_movie_name") String moviename, @RequestParam(value = "new_movie_datetime") String dateTime, @RequestParam(value = "which_theater_id") int theaterId){
        Movies movies = new Movies(moviename, dateTime, theaterId);

        Map result = moviesService.addMovie(movies);

        Gson gson = new Gson();

        System.out.println(gson.toJson(result));
        return gson.toJson(result);
    }

    /**
     * Metoden returnMovieSchema tar ett moviename från frontenden och skickar till backenden för att få tillbaka
     * samtliga filmvisningar som har detta namn.
     * @param moviename
     * @return
     */
    @GetMapping("/return_movie_schema")
    public String returnMovieSchema(@RequestParam(value = "pick_movie_name") String moviename){
        Movies movies = new Movies(moviename);

        Map<String, Object> result = moviesService.returnMovieSchema(movies);

        Gson gson = new Gson();

        System.out.println(gson.toJson(result));
        return gson.toJson(result);

    }


}
