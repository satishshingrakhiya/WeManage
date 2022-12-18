package com.wemanage.EmployeeDetails.service;

import com.wemanage.EmployeeDetails.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployeeDetails(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
}
