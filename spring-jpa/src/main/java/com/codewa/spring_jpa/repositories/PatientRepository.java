package com.codewa.spring_jpa.repositories;

import com.codewa.spring_jpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
