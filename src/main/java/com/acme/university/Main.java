package com.acme.university;

import com.acme.university.model.Student;
import com.acme.university.model.Unit;
import com.acme.university.model.UnitType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Unit unit = Unit.builder().name("Maths").unitType(UnitType.MANDATORY).build();
        unit.setId(2L);
        System.out.println(Arrays.toString(UnitType.values()));
        System.out.println(unit.getUnitType().equals(UnitType.MANDATORY));
        System.out.println(unit.getUnitType() == UnitType.MANDATORY);
        System.out.println(UnitType.MANDATORY.getId());
        System.out.println(unit);
        Student student = new Student();
        student.setId(1L);
        System.out.println("Hello world!");
    }

}