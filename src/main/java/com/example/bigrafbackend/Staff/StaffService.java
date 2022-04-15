package com.example.bigrafbackend.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StaffService {

    @Autowired
    StaffDAO staffdao;

    public Map addStaff(Staff staff) {
        return staffdao.addStaff(staff.getName(), staff.getPhone(), staff.getUsername(), staff.getPassword(), staff.getTom());

    }

    public Map staffLogin(Staff staff){
        return staffdao.staffLogin(staff.getUsername(), staff.getPassword(), staff.getTom());

    }

    public Map deleteStaff(Staff staff){
        return  staffdao.deleteStaff(staff.getUsername(), staff.getPassword(), staff.getTom());

    }
}

