package com.ericdschmid.budget.model;

public class Charge extends BaseCharge {

    private Account account;


    //@ManyToOne

    public Charge(double amount, String date, ChargeCategory chargeCategory,
                  String dek, Account account){
        super(amount, date, chargeCategory, dek);
        this.account = account;
    }

    public Account getAccountDetails() {
        return account;
    }

    public void setAccountDetails(Account account) {
        this.account = account;
    }


}
