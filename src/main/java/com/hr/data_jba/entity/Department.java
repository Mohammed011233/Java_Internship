package com.hr.data_jba.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@Table(name = "department")
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "department_gen")
//    @SequenceGenerator(name = "department_gen" , sequenceName = "department_seq" , initialValue = 50)

//    @GeneratedValue(strategy = GenerationType.TABLE )
    private Long id;

    @Column

    private String name;


    @OneToMany(mappedBy = "department")
    @JsonIgnore
    private List<Employee> employees;

}
