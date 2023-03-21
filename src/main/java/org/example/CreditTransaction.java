package org.example;

public class CreditTransaction extends Transaction {

    private AccountDetails accountDetails;


    //@ManyToOne

    public CreditTransaction(double amount, String date, ChargeCategory chargeCategory, String dek, AccountDetails accountDetails){
        super(amount, date, chargeCategory, dek);
        this.accountDetails = accountDetails;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
}
