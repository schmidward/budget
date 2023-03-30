package com.ericdschmid.budget.model;

import com.ericdschmid.budget.helpingFunctions.dateHelpers;

import java.util.Objects;


public abstract class BaseCharge implements dateHelpers {

    //TODO #1 - CONVERT TO CHARGE DETAILS

    private int id;
    private static int nextId = 1;
    private double amount;
    private String date;
    private Integer intDate = null;
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

    public Integer getIntDate() {
        return intDate;
    }

    public void setIntDate(Integer intDate) {
        this.intDate = intDate;
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

    @Override
    public void dateTransform(){
        String date = this.getDate();
        String year = date.substring(date.length() - 4, date.length());
        String monthAndDay = date.substring(0, 5);
        String newDate = year + "-" + monthAndDay;
        this.setDate(newDate);
    };

    @Override
    public void dateToInteger(){
        String date = this.getDate();
        String[] newDate = date.split("-");
        String newDate2 = date.join("", newDate);
        Integer intDate = Integer.parseInt(newDate2);
        this.setIntDate(intDate);
    }

}
