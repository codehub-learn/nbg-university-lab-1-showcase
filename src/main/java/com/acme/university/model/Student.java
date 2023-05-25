package com.acme.university.model;

import lombok.Data;

import java.util.List;

@Data
public class Student extends BaseEntity{
    private String firstname;
    private String lastname;
    private List<Enrollment> enrollments;
}
