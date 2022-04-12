package com.example.bigrafbackend.Movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MoviesService {

    @Autowired
    MoviesDAO moviesDAO;

    public void addMovie(Movies movies){
        moviesDAO.addMovies(movies.getMoviename(), movies.getDateTime(), movies.getTheaterId());
    }

    public Map returnMovieSchema(Movies movies){
        return moviesDAO.returnMovieSchema(movies.getMoviename());
    }

}
