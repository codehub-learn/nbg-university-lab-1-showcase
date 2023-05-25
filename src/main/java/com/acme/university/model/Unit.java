package com.acme.university.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
public class Unit extends BaseEntity{
    private String name;
    private String tutorName;
    private UnitType unitType;
}
