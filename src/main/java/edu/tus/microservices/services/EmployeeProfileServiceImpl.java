package edu.tus.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tus.microservices.EmployeeProfile;
import edu.tus.microservices.controllers.EmployeeProfileService;
import edu.tus.microservices.dao.ProfileRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    @Autowired
    ProfileRepository repository;
    List < EmployeeProfile > employeeProfileList = new ArrayList < > ();

    @Override
    public void addEmployeeProfile(EmployeeProfile profile) {
        repository.save(profile);
    }

    @Override
    public List < EmployeeProfile > getEmployeeProfiles() {
        return repository.findAll();
    }
}