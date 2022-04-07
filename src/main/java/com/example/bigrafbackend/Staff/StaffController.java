package com.example.bigrafbackend.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;


    @GetMapping("/addStaff")
    public void addStaff(@RequestParam(value = "adminName") String name, @RequestParam(value = "phone") String phone, @RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        Staff test = new Staff(name, phone, username, password);
        staffService.addStaff(test);

    }
}
