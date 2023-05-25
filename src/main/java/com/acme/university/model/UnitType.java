package com.acme.university.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitType {
    OPTIONAL(0),MANDATORY(1);
    private final int id;
}
