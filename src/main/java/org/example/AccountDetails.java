package org.example;

public class AccountDetails {

    private String name;
    private String type;
    private String dek;
    private String dateOpened;

    //@OneToMany(mappedBy= accountDetails)

    public AccountDetails(String name, String accountType, String dek, String dateOpened) {
        this.name = name;
        this.type = accountType;
        this.dek = dek;
        this.dateOpened = dateOpened;
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

    public String getDek() {
        return dek;
    }

    public void setDek(String dek) {
        this.dek = dek;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }
}
