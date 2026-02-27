package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee registerEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public String loginEmployee(String email, String password) {
        Employee employee = employeeRepository.findByEmail(email);
        if(password.equals(employee.getPassword())) {
            return "login successful";
        }
        return "login failed";
    }
    public String getEmployeeName(String email) {
        Employee employee = employeeRepository.findByEmail(email);
        if(employee == null) {
            return "employee not found";
        }
        return employee.getName();
    }

}
