package com.jdbc.hr.controler;

import com.jdbc.hr.model.Employee;
import com.jdbc.hr.repository.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeControler {

    @Autowired
    private EmployeeRepos employeeRepos;

    @GetMapping("/count")
    public int countEmployees(){
        return employeeRepos.count();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeRepos.findById(id);
    }

    @GetMapping("/")
    public List<Employee> findAll(){
        return employeeRepos.findAll();
    }

}
