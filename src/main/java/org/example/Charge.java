package org.example;

import org.example.helpingFunctions.miscHelpers;

public class Charge extends BaseCharge implements miscHelpers {

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

    @Override
    public void dateTransform(){
        String date = this.getDate();
        String year = date.substring(date.length() - 4, date.length());
        String monthAndDay = date.substring(0, 5);
        String newDate = year + "-" + monthAndDay;
        this.setDate(newDate);
    };
}
