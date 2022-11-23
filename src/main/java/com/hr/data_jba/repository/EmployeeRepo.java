package com.hr.data_jba.repository;

import com.hr.data_jba.entity.Department;
import com.hr.data_jba.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee , Long> {

    List<Employee> findByDepartmentId(Long id);
}
