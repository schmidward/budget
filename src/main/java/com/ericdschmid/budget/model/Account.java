package com.ericdschmid.budget.model;

public class Account {

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
}
