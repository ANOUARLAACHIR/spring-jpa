package com.codewa.spring_jpa.repositories;

import com.codewa.spring_jpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findBySick(boolean s);
    List<Patient> findBySickIsTrueAndScoreGreaterThan(int score);
    @Query("select p from Patient p where p.sick = :x ")
    List<Patient> sickPatients(@Param("x") boolean sick);
}
