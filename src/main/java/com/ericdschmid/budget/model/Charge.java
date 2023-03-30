package com.ericdschmid.budget.model;

public class Charge extends BaseCharge {

    private String account;


    //TODO #1 - REFACTOR REFACTOR REFACTOR - crate charge details class. implement the ChargeCategory and Account relationships

    public Charge() {}

    public Charge(double amount, String date, ChargeCategory chargeCategory,
                  String dek, String account){
        super(amount, date, chargeCategory, dek);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
