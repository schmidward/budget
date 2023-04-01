package com.ericdschmid.budget.model;

public enum AccountType {
    CHECKING("Checking"),
    CREDIT("Credit Card"),
    SAVINGS("Savings");

    private final String displayName;

    AccountType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
