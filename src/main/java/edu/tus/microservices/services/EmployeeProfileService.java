package edu.tus.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.tus.microservices.dto.EmployeeProfile;

@Service
public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}
