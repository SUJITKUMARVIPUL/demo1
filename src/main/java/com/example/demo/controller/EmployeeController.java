package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("email/{email}")
    public String findByEmail(@PathVariable String email) {
        return employeeService.getEmployeeName(email);
    }

    @PostMapping("create")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.registerEmployee(employee);
    }
    @PostMapping("login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return employeeService.loginEmployee(email, password);
    }
}
