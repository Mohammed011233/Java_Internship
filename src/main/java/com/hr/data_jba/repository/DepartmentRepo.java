package com.hr.data_jba.repository;

import com.hr.data_jba.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department , Long> {

}
