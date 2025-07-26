package com.luv2code.springboot.thymelafdemo.service;

import com.luv2code.springboot.thymelafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
