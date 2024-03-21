package com.ironhack.lab.Intro.Spring.Boot.repository;

import com.ironhack.lab.Intro.Spring.Boot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
