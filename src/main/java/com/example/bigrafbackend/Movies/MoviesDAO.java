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
            String query = "Call add_movie(?, ?, ?)";

            jdbcTemplate.update(query, movieName, dateTime, theaterId);
        }

            public Movies getMoviesById(int id){

                String query = "SELECT * FROM Movies WHERE movie_id =?";

                Movies movies = jdbcTemplate.queryForObject(query, new RowMapper<Movies>() {
                    @Override
                    public Movies mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Movies mov = new Movies(rs.getInt("movie_id"),
                                rs.getInt("movie_theatreId"),
                                rs.getString("movie_name"),
                                rs.getString("movie_dateTime"));


                        return mov;

                    }
                }, id);

                return movies;



            }








    }



