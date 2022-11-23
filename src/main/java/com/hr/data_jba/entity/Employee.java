package com.hr.data_jba.entity;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Double salary;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id" , referencedColumnName = "id")
    private Department department;
}
