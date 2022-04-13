package com.example.bigrafbackend.Movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MoviesService {

    @Autowired
    MoviesDAO moviesDAO;

    public Map addMovie(Movies movies){
        return moviesDAO.addMovies(movies.getMovie_name(), movies.getMovie_datetime(), movies.getTheater_id());
    }

    public Map<String, Object> returnMovieSchema(Movies movies){

        return moviesDAO.returnMovieSchema(movies.getMovie_name());
    }

    public void callMovies(Movies movies){
        moviesDAO.callMovies();
    }

}
