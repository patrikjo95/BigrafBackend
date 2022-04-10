package com.example.bigrafbackend.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StaffService {

    @Autowired
    StaffDAO staffdao;

    public Map addStaff(Staff staff) {
        Map outParameters = staffdao.addStaff(staff.getName(), staff.getPhone(), staff.getUsername(), staff.getPassword(), staff.getTom());

        System.out.println("outParameters i service: " + outParameters);
        return outParameters;
    }

    public void staffLogin(Staff staff){

    }
}

