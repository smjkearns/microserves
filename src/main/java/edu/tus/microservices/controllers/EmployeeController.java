package edu.tus.microservices.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import edu.tus.microservices.dto.EmployeeProfile;
import edu.tus.microservices.services.EmployeeProfileService;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeProfileService employeeProfileService;

    @PostMapping("/test")
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping("/test")
    public List < EmployeeProfile > getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }

}
