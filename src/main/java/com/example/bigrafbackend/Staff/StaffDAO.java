package com.example.bigrafbackend.Staff;

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
public class StaffDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map addStaff(String name, String phone, String username, String password, String tom) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("add_staff");

        Map<String, String> inParameters = new HashMap<>();

        Staff staff = new Staff(name, phone, username, password, tom);

        inParameters.put("new_name", name);
        inParameters.put("new_phonenumber", phone);
        inParameters.put("new_username", username);
        inParameters.put("new_password", password);

        SqlParameterSource in = new MapSqlParameterSource(inParameters);

        Map<String, Object> outParameters = jdbcCall.execute(in);

        staff.setName(name);
        staff.setPhone(phone);
        staff.setUsername(username);
        staff.setPassword(password);
        //staff.setTom((String) outParameters.get("@tom"));

        jdbcCall.execute(in);

        //System.out.println("outParameters i dao: " + outParameters); //outParameters listan ÄR duplicate tabellen

        return outParameters;
    }

    public Map staffLogin(String username, String password, String tom){
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("scan_username_and_password");

        Map<String, String> inParameters = new HashMap<>();

        inParameters.put("check_username", username);
        inParameters.put("check_password", password);

        SqlParameterSource in = new MapSqlParameterSource(inParameters);

        Map<String, Object> outParameters = jdbcCall.execute(in);

        jdbcCall.execute(in);

        /*System.out.println("tom: " + tom);

        System.out.println("outParameters i dao: " + outParameters); //outParameters listan ÄR duplicate tabellen*/

        return outParameters;

    }

    public Map deleteStaff(String username, String password, String tom){
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("delete_staff");

        Map<String, String> inParameters = new HashMap<>();

        inParameters.put("select_username", username);
        inParameters.put("select_password", password);

        SqlParameterSource in = new MapSqlParameterSource(inParameters);

        Map<String, Object> outParameters = jdbcCall.execute(in);

        jdbcCall.execute(in);

        //System.out.println("tom: " + tom);

        //((System.out.println("outParameters i dao: " + outParameters);

        return outParameters;

    }




}

