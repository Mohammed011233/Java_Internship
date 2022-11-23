package com.hr.data_jba.models;

import lombok.Data;

@Data
public class EmployeeModel {
    private Long Id;
    private String name;
    private Double salary;
    private Long departmentId;
}
