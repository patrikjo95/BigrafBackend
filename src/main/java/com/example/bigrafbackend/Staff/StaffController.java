package com.example.bigrafbackend.Staff;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;


    @GetMapping("/addStaff")
    public String addStaff(@RequestParam(value = "adminName") String name, @RequestParam(value = "phone") String phone, @RequestParam(value = "username") String username, @RequestParam(value = "password") String password, @RequestParam(value = "@tom") String tom){
        Staff staff = new Staff(name, phone, username, password, tom);

        Map outParameters = staffService.addStaff(staff);

        Gson gson = new Gson();

        //System.out.println("OutParameters i controller: " + outParametersAsString);

        return gson.toJson(outParameters);

    }

    @GetMapping("/staffLogin")
    public String staffLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password, @RequestParam(value = "@tom") String tom){
        Staff staff = new Staff(username, password, tom);

        Map outParameters = staffService.staffLogin(staff);

        Gson gson = new Gson();

        //System.out.println("outParameters i controller: " + outParametersAsString);

        return gson.toJson(outParameters);
    }

    @GetMapping("/deleteStaff")
    public String deleteStaff(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password, @RequestParam(value = "@tom") String tom){
        Staff staff = new Staff(username, password, tom);

        Map outParameters = staffService.staffLogin(staff);

        Gson gson = new Gson();

        //System.out.println("outParameters i controller: " + outParametersAsString);

        return gson.toJson(outParameters);

    }
}
