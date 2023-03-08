package org.example;

import java.time.LocalDate;

public class CreditTransaction extends Transaction {

    private String chargeType;
    //Dek stands for description
    private String dek;

    CreditTransaction(double amount, LocalDate date, String chargeType, String dek){
        super(amount, date);
        this.chargeType = chargeType;
        this.dek = dek;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getDek() {
        return dek;
    }

    public void setDek(String dek) {
        this.dek = dek;
    }
}
