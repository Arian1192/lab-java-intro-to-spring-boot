package com.ironhack.lab.Intro.Spring.Boot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private long admitted_by;
}
