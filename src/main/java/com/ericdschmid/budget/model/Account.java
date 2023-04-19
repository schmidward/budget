package com.ericdschmid.budget.model;

import com.ericdschmid.budget.helpingFunctions.dateHelpers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Account extends AbstractEntity {

    private String name;
    private AccountType type;
    private String dateOpened;
    @OneToMany(mappedBy = "account")
    private final List<Charge> charges = new ArrayList<>();

    public Account() {}

    public Account(String name, AccountType accountType, String dateOpened) {
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

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
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
