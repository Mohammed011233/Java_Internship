package com.hr.data_jba.controller;

import com.hr.data_jba.entity.Employee;
import com.hr.data_jba.models.EmployeeModel;
import com.hr.data_jba.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("employee")
public class EmployeesControl {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("insert")
    public Employee add(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }

    @PutMapping("update")
    public Employee updte(@RequestBody EmployeeModel employeeModel){
        return employeeService.update(employeeModel);
    }

    @GetMapping("{id}")
    public Employee getById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.findAll();
    }

    @GetMapping("department/{id}")
    public List<Employee> findByDepartmentId(@PathVariable Long id){
        return employeeService.findByDepartmentId(id);
    }

    @DeleteMapping("delete/{id}")
    public void removeById(@PathVariable Long id){
        employeeService.deleteById(id);
    }
}
