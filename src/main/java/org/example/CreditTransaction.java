package org.example;

public class CreditTransaction extends Transaction {

    private AccountDetails accountDetails;

    public CreditTransaction(double amount, String date, ChargeCategory chargeCategory, String dek, AccountDetails accountDetails){
        super(amount, date, chargeCategory, dek);
        this.accountDetails = accountDetails;
    }




}
