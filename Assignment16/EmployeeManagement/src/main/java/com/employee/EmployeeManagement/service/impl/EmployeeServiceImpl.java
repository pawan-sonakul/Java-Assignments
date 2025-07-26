package com.employee.EmployeeManagement.service.impl;

import com.employee.EmployeeManagement.entity.Employee;
import com.employee.EmployeeManagement.repository.EmployeeRepository;
import com.employee.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getByID(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Long id, Employee current) {
        Employee newEmployee = getByID(id);
        newEmployee.setName(current.getName());
        newEmployee.setDepartment(current.getDepartment());
        newEmployee.setSalary(current.getSalary());
        employeeRepository.save(newEmployee);
        return newEmployee;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
