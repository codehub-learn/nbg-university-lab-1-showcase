package com.acme.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Enrollment extends BaseEntity{
    private Integer grade;
    private Unit unit;
}
