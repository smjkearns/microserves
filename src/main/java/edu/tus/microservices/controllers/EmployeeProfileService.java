package edu.tus.microservices.controllers;

import java.util.List;

import edu.tus.microservices.EmployeeProfile;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}
