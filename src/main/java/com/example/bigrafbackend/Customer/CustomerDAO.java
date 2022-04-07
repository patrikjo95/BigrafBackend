package com.example.bigrafbackend.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

     public void insertCustomers(int id, String number, String age, String name, String address){

         String query = "INSERT INTO customer (customer_id, customer_number, customer_age, customer_name, customer_address) VALUES(?,?,?,?,?)";

         int result = jdbcTemplate.update(query, id, number, age, name, address);

         if (result > 0) {
             System.out.println(result + "Customer added to database, good job dumbass");
         }

         }

         public Customer getCustomerById(int id){

             String query = "SELECT * FROM Customer WHERE customer_id =?";

             Customer customer = jdbcTemplate.queryForObject(query, new RowMapper<Customer>() {
                 @Override
                 public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                     Customer cus = new Customer(rs.getInt("Customer_id"),
                             rs.getString("customer_number"),
                             rs.getString("customer_age"),
                             rs.getString("customer_name"),
                             rs.getString("customer_address"));

                     return cus;

                 }
             }, id);

             return customer;



         }






     }









