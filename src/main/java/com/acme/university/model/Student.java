package com.acme.university.model;

import java.util.List;
public class Student extends BaseEntity{
    private String firstname;
    private String lastname;
    private List<Enrollment> enrollments;
}
