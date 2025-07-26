package com.employee.EmployeeManagement.controller;

import com.employee.EmployeeManagement.entity.Employee;
import com.employee.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/check")
    public String check() {
        return "Spring Boot App Working Fine!";
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> displayAll() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee employeeById(@PathVariable("id") Long id) {
        return employeeService.getByID(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee current) {
        return employeeService.update(id, current);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully!";
    }

}
