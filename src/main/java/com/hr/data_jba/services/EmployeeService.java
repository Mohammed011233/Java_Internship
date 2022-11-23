package com.hr.data_jba.services;

import java.util.*;

import com.hr.data_jba.entity.Department;
import com.hr.data_jba.entity.Employee;
import com.hr.data_jba.models.EmployeeModel;
import com.hr.data_jba.repository.DepartmentRepo;
import com.hr.data_jba.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentRepo departmentRepo;

    public Employee insert(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee update (EmployeeModel employeeModel){
        Employee currentEmployee
                = employeeRepo
                .findById(employeeModel.getId()).get();

//        if (currentEmployee == null) return spring boot validation;

        currentEmployee.setSalary(employeeModel.getSalary());
        return employeeRepo
                .save(currentEmployee);
    }

    public Employee findById(Long id){
        return employeeRepo
                .findById(id)
                .orElseThrow();

    }

    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }

    public List<Employee> findByDepartmentId(Long id){
        return employeeRepo.findByDepartmentId(id);
    }

    public void deleteById(Long id){
        employeeRepo.deleteById(id);
    }
}
