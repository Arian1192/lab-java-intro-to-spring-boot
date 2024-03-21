package com.ironhack.lab.Intro.Spring.Boot.service;

import com.ironhack.lab.Intro.Spring.Boot.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService  {
    @Autowired
    private PatientRepository patientRepository;

    // USE CASE TO FIND using Repository.
}
