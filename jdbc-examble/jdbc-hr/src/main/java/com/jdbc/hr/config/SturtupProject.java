package com.jdbc.hr.config;

import com.jdbc.hr.model.Employee;
import com.jdbc.hr.repository.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SturtupProject implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EmployeeRepos employeeRepos;

    @Override
    public void run(String... args) throws Exception {

        jdbcTemplate.execute("DROP TABLE IF EXISTS employees");

        jdbcTemplate.execute("CREATE TABLE employees(id SERIAL ,name VARCHAR(255) ,salary NUMERIC(15 , 2)) ");

        if(employeeRepos.count() == 0){
            employeeRepos.insert(new Employee(10L , "Mohamed" , 5500.5));
            employeeRepos.insert(new Employee(11L , "Ahmed" , 6000.0));
            employeeRepos.insert(new Employee(12L , "Khaled" , 40000.0));
            employeeRepos.insert(new Employee(13L , "mohamed" , 7000.2));
            employeeRepos.insert(new Employee(14L , "Eslam" , 5500.5));

        }
    }
}
