package com.example.bigrafbackend.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class StaffService {

    @Autowired
    StaffDAO staffdao;

    public void addStaff(Staff staff) {
        staffdao.addStaff(staff.getName(), staff.getPhone(), staff.getUsername(), staff.getPassword());
    }

    public void staffLogin(Staff staff){

    }
}

