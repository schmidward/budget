package org.example;

import java.util.Objects;

public abstract class BaseCharge {
    private int id;
    private static int nextId = 1;
    private double amount;
    private String date;

    private ChargeCategory chargeCategory;
    //Dek stands for description
    private String dek;

    public BaseCharge(){
        id = nextId;
        nextId++;
    }
    public BaseCharge(double amount, String date, ChargeCategory chargeCategory, String dek){
        this();
        this.amount = amount;
        this.date = date;
        this.chargeCategory = chargeCategory;
        this.dek = dek;
    }

    public int getId() { return id; }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ChargeCategory getChargeCategory() {
        return chargeCategory;
    }

    public void setChargeCategory(ChargeCategory chargeCategory) {
        this.chargeCategory = chargeCategory;
    }

    public String getDek() {
        return dek;
    }

    public void setDek(String dek) {
        this.dek = dek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BaseCharge that = (BaseCharge) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
