package com.wemanage.EmployeeDetails.repository;

import com.wemanage.EmployeeDetails.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
