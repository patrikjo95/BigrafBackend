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
    public void addStaff(@RequestParam(value = "adminName") String name, @RequestParam(value = "phone") String phone, @RequestParam(value = "username") String username, @RequestParam(value = "password") String password, @RequestParam(value = "@tom") String tom){
        System.out.println("bajs");
        Staff staff = new Staff(name, phone, username, password, tom);
        staffService.addStaff(staff);

    }

    @GetMapping("/staffLogin")
    public void staffLogin(){


    }
}
