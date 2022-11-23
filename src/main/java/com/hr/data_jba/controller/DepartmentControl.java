package com.hr.data_jba.controller;

import com.hr.data_jba.entity.Department;
import com.hr.data_jba.entity.Employee;
import com.hr.data_jba.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentControl {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("insert")
    public Department insert(@RequestBody Department department){
        return departmentService.insert(department);
    }

    @PutMapping("update")
    public Department update(@RequestBody Department department){
        return departmentService.update(department);
    }

    @GetMapping("{id}")
    public Department findById(@PathVariable Long id){
        return departmentService.findById(id);
    }


    @GetMapping
    public List<Department> findAll(){
        return departmentService.findAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id){
        departmentService.deleteById(id);
    }
}
