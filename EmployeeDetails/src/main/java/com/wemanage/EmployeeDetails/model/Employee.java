package com.wemanage.EmployeeDetails.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String designation;
    private short totalExperience;
    private List<Map<String, Short>> skills;
}
