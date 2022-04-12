package com.example.bigrafbackend.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


@Repository
    public class MoviesDAO{

        @Autowired
        private JdbcTemplate jdbcTemplate;

        public void addMovies(String movieName, String dateTime, int theaterId) {
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("add_movie");

            Map<String, String> inParameters = new HashMap<>();


            inParameters.put("movieName", movieName);
            inParameters.put("dateTime", dateTime);
            inParameters.put("theaterId", String.valueOf(theaterId));

            SqlParameterSource in = new MapSqlParameterSource(inParameters);

            jdbcCall.execute(in);

        }

        public Map returnMovieSchema(String moviename){
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("returnMovieSchema");

            Map<String, String> inParameters = new HashMap<>();

            inParameters.put("Moviename", moviename);

            SqlParameterSource in = new MapSqlParameterSource(inParameters);


            return jdbcCall.execute(in);
        }

}



