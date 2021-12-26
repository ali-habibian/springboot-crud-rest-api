package com.ali.springboot.service.impl;

import com.ali.springboot.entity.Employee;
import com.ali.springboot.repository.EmployeeRepository;
import com.ali.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
