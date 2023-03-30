package com.ericdschmid.budget.model;

import com.ericdschmid.budget.helpingFunctions.dateHelpers;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Account extends AbstractEntity {

    //TODO #2 - CONVERT TO MAPPED CLASS


    private String name;
    private String type;
    private String dateOpened;
    @OneToMany(mappedBy = "account")
    private final List<Charge> charges = new ArrayList<>();

    public Account() {}

    public Account(String name, String accountType, String dateOpened) {
        this.name = name;
        this.type = accountType;
        this.dateOpened = dateOpened;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public String toString() {
        return this.name;
    }

}
