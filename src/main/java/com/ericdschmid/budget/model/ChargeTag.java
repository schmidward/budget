package com.ericdschmid.budget.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ChargeTag extends AbstractEntity {

    @NotBlank(message = "Name of charge category is required.")
    private String name;

    @ManyToMany(mappedBy="category")
    private final List<Charge> charges = new ArrayList<>();

    public ChargeTag() {}

    public ChargeTag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Charge> getCharges() {
        return charges;
    }
}
