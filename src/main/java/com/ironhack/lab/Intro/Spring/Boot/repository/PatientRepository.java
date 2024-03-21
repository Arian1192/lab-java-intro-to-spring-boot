package com.ironhack.lab.Intro.Spring.Boot.repository;

import com.ironhack.lab.Intro.Spring.Boot.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
