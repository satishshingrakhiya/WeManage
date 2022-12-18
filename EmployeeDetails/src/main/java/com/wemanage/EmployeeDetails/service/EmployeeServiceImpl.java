package com.wemanage.EmployeeDetails.service;

import com.wemanage.EmployeeDetails.model.Employee;
import com.wemanage.EmployeeDetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee saveEmployeeDetails(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }
}
