package com.ericdschmid.budget.model;

import com.ericdschmid.budget.helpingFunctions.dateHelpers;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class ChargeDetails extends AbstractEntity implements dateHelpers {

    //TODO #1 - CONVERT TO CHARGE DETAILS

    private double amount;
    private String date;
    private Integer intDate = null;
    //Dek stands for description
    private String dek;

    public ChargeDetails() {}

    public ChargeDetails(double amount, String date, String dek){
        this.amount = amount;
        this.date = date;
        this.dek = dek;
    }

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

    public String getDek() {
        return dek;
    }

    public void setDek(String dek) {
        this.dek = dek;
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
