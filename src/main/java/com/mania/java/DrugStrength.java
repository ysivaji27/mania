package com.mania.java;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DrugStrength {
    String name;
    int salary;
    public boolean isValidDrugDescription() {
        return true;
    }
}
