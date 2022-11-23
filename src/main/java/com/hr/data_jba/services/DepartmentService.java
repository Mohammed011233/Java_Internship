package com.hr.data_jba.services;

import com.hr.data_jba.entity.Department;
import com.hr.data_jba.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;




    public Department insert(Department department){
        return departmentRepo
                .save(department);
    }

    public Department update (Department department){
        return departmentRepo
                .save(department);
    }

    public Department findById(Long id){
        return departmentRepo
                .findById(id)
                .orElseThrow();

    }

    public List<Department> findAll(){
        return departmentRepo
                .findAll();

    }

    public void deleteById(Long id){
        departmentRepo.deleteById(id);
    }




}
