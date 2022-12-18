package com.wemanage.EmployeeDetails.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@Document("employeedetails")
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String designation;
    private short totalExperience;
    //private List<Map<String, Short>> skills;
}
