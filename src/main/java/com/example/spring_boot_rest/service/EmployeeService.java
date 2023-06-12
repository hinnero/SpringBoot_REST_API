package com.example.spring_boot_rest.service;


import com.example.spring_boot_rest.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);

}
