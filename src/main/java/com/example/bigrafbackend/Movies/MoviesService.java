package com.example.bigrafbackend.Movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {

    @Autowired
    MoviesDAO moviesDAO;

    public void addMovie(Movies movies){
        moviesDAO.insertMovies(movies.getName(), movies.getDateTime(), movies.getTheaterId());
    }

    public void getMovies(){
        //Lägg in select from här, kan vara bra att koppla mot film, knapparna
    }

}
