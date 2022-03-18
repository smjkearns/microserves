package edu.tus.microservices.dao;

import edu.tus.microservices.dto.EmployeeProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends JpaRepository < EmployeeProfile, Integer > {
    
}
