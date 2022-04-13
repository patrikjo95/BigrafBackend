package com.example.bigrafbackend.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
    public class MoviesDAO{

        @Autowired
        private JdbcTemplate jdbcTemplate;

        public Map addMovies(String movieName, String dateTime, int theaterId) {
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("add_movie");

            Map<String, String> inParameters = new HashMap<>();


            inParameters.put("movie_name", movieName);
            inParameters.put("movie_datetime", dateTime);
            inParameters.put("theater_id_order", String.valueOf(theaterId));

            SqlParameterSource in = new MapSqlParameterSource(inParameters);


            return jdbcCall.execute(in);
        }

        public Map<String, Object> returnMovieSchema(String moviename){

            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("returnMovieSchema");

            Map<String, String> inParameters = new HashMap<>();

            inParameters.put("Moviename", moviename);

            SqlParameterSource in = new MapSqlParameterSource(inParameters);

            return jdbcCall.execute(in);
        }

        public void callMovies(){
            String query =  "SELECT * FROM MOVIES";


        }


}



