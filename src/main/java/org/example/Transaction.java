package org.example;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Transaction {
    private int id;
    private static int nextId = 1;
    private double amount;
    private String date;

    private ChargeCategory chargeCategory;
    //Dek stands for description
    private String dek;

    public Transaction(){
        id = nextId;
        nextId++;
    }
    public Transaction(double amount, String date, ChargeCategory chargeCategory, String dek){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Transaction that = (Transaction) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
