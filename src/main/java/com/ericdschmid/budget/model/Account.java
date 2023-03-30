package com.ericdschmid.budget.model;

public class Account {

    //TODO #2 - CONVERT TO MAPPED CLASS

    private int id;
    private static int nextId = 1;
    private String name;
    private String type;
    private String dateOpened;

    //@OneToMany(mappedBy= accountDetails)

    Account() {
        this.id = nextId;
        nextId++;
    }

    public Account(String name, String accountType, String dateOpened) {
        this();
        this.name = name;
        this.type = accountType;
        this.dateOpened = dateOpened;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return id == account.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
