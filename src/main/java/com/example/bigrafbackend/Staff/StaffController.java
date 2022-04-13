package com.example.bigrafbackend.Staff;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;


    @GetMapping("/add_staff")
    public String addStaff(@RequestParam(value = "new_name") String name, @RequestParam(value = "new_phonenumber") String phone, @RequestParam(value = "new_username") String username, @RequestParam(value = "new_password") String password, @RequestParam(value = "@tom") String tom){
        Staff staff = new Staff(name, phone, username, password, tom);

        Map outParameters = staffService.addStaff(staff);

        Gson gson = new Gson();

        //System.out.println("OutParameters i controller: " + outParametersAsString);

        System.out.println("out parameters i staffController" +  outParameters);

        return gson.toJson(outParameters);

    }

    @GetMapping("/staff_login")
    public String staffLogin(@RequestParam(value = "check_username") String username, @RequestParam(value = "check_password") String password, @RequestParam(value = "@tom") String tom){
        Staff staff = new Staff(username, password, tom);

        Map outParameters = staffService.staffLogin(staff);

        Gson gson = new Gson();

        //System.out.println("outParameters i controller: " + outParameters);

        return gson.toJson(outParameters);
    }

    @GetMapping("/delete_staff")
    public String deleteStaff(@RequestParam(value = "select_username") String username, @RequestParam(value = "select_password") String password, @RequestParam(value = "@tom") String tom){
        Staff staff = new Staff(username, password, tom);

        Map outParameters = staffService.deleteStaff(staff);

        Gson gson = new Gson();

        //System.out.println("outParameters i controller: " + outParametersAsString);

        return gson.toJson(outParameters);

    }
}
