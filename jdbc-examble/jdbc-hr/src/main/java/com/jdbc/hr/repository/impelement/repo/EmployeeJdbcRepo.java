package com.jdbc.hr.repository.impelement.repo;

import com.jdbc.hr.mapper.EmployeeMapper;
import com.jdbc.hr.model.Employee;
import com.jdbc.hr.repository.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeJdbcRepo implements EmployeeRepos {

    @Autowired
    private JdbcTemplate JdbcTemplate ;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int count() {
        return JdbcTemplate.queryForObject("select count(*) from employees" , Integer.class);
    }

    @Override
    public Employee findById(Long id) {

        return JdbcTemplate.queryForObject("select * from employees where id = ?"
                ,new Object[] {id}
                , employeeMapper
        );
    }

    @Override
    public List<Employee> findAll() {
        return JdbcTemplate.query("select * from employees" , employeeMapper);
    }

    @Override
    public int insert(Employee employee) {
        return JdbcTemplate.update("insert into employees (id , name , salary) values (? , ? , ?)"
                , new Object[] {employee.getId() , employee.getName() , employee.getSalary()}
        );
    }

    @Override
    public int update(Employee employee) {
        return JdbcTemplate.update("update employees set name = ? , salary = ?"
                , new Object[] {employee.getName() , employee.getSalary()}
        );
    }

    @Override
    public int delete(Long id) {
        return JdbcTemplate.update("delete from employees where id = ?"
                , new Object[]{id}
                );
    }
}
