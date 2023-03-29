package com.ericdschmid.budget.model;

public class Charge extends BaseCharge {

    private String account;


    //@ManyToOne

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
