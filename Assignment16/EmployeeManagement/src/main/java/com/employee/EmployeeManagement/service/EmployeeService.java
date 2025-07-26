package com.employee.EmployeeManagement.service;

import com.employee.EmployeeManagement.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee);

    List<Employee> getAll();

    Employee getByID(Long id);

    Employee update(Long id, Employee current);

    void deleteEmployee(Long id);

}
