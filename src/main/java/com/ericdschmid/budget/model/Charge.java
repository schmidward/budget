package com.ericdschmid.budget.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Charge {


    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    private ChargeDetails details;
    @ManyToOne
    private Account account;
    @ManyToMany
    private List<ChargeCategory> category = new ArrayList<>();

    //TODO #1 - REFACTOR REFACTOR REFACTOR - crate charge details class. implement the ChargeCategory and Account relationships

    public Charge() {}

    public Charge(ChargeDetails details, Account account, List<ChargeCategory> category){
        this.details = details;
        this.account = account;
        this.category = category;
    }

    public ChargeDetails getDetails() {
        return details;
    }

    public void setDetails(ChargeDetails details) {
        this.details = details;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<ChargeCategory> getCategory() {
        return category;
    }

    public void setCategory(List<ChargeCategory> category) {
        this.category = category;
    }
}
