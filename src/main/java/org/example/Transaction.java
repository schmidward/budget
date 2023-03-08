package org.example;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private static int nextId = 1;
    private double amount;
    private LocalDate date;

    public Transaction(){
        id = nextId;
        nextId++;
    }
    public Transaction(double amount, LocalDate date){
        this();
        this.amount = amount;
        this.date = date;
    }

    public int getId() { return id; }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
