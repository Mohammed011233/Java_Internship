package com.jdbc.hr.repository;

import com.jdbc.hr.model.Employee;

import java.util.*;

public interface EmployeeRepos {

    int count();

    Employee findById(Long id);

    List<Employee> findAll();

    int insert(Employee employee);

    int update(Employee employee);


    int delete(Long id);
}
