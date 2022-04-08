package com.example.bigrafbackend.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StaffDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addStaff(String name, String phone, String username, String password, String tom) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("addStaff");

        Map<String, String> inParameters = new HashMap<>();


        inParameters.put("name", name);
        inParameters.put("phone", phone);
        inParameters.put("username2", username);
        inParameters.put("password2", password);
        String out = inParameters.put("Douplicate", tom);


        SqlParameterSource in = new MapSqlParameterSource(inParameters);

        jdbcCall.execute(in);

        System.out.println(inParameters);

        System.out.println(out);

    }

    public void staffLogin(String username, String password){
        String query = "CALL decryptTable('alla')";

    }



    public void insertStaff(int id, String name, String phone, String userName, String passWord, String add_staff, String delete_staff, String role, String hours, String sell_tickets, String tickets_sold, String movie_name, String dateTime) {

        String query = "INSERT INTO Staff (Staff_id, Staff_name, Staff_phone, Staff_userName, Staff_passWord, Staff_add_staff, Staff_delete_staff, Staff_role, Staff_hours, Staff_sell_tickets, Staff_tickets_sold, Staff_movie_name, Staff_dateTime ) VALUES(?,?,?,?,?)";

        int result = jdbcTemplate.update(query, id, name, phone, userName, passWord, add_staff, delete_staff, role, hours, sell_tickets, tickets_sold, movie_name, dateTime);

        if (result > 0) {
            System.out.println(result + " Theater added to database, good job dumbass");

        }

    }

    /*public Staff getStaffById(int id){

        String query = "SELECT * FROM Staff WHERE Staff_id =?";

        Staff staff = jdbcTemplate.queryForObject(query, new RowMapper<Staff>() {
            @Override
            public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
                Staff staff1 = new Staff(rs.getInt("Staff_id"),
                        rs.getString("Staff_name"),
                        rs.getString("Staff_phone"),
                        rs.getString("Staff_add_staff"),
                        rs.getString("Staff_delete_staff"),
                        rs.getString("Staff_role"),
                        rs.getString("Staff_hours"),
                        rs.getString("Staff_sell_tickets"),
                        rs.getString("Staff_tickets_sold"),
                        rs.getString("Staff_movie_name"),
                        rs.getString("Staff_dateTime"),
                        rs.getString("Staff_passWord"));

                return staff1;

            }
        }, id);

        return staff;
*/


    }
