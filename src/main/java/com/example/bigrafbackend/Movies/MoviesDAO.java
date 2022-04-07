package com.example.bigrafbackend.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
    public class MoviesDAO{

        @Autowired
        private JdbcTemplate jdbcTemplate;

        public void insertMovies(String movieName, String dateTime, int theaterId) {
            String query = "CALL add_movie(?, ?, ?)";

            jdbcTemplate.update(query, movieName, dateTime, theaterId);
        }

}



