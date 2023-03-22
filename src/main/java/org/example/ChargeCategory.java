package org.example;

public enum ChargeCategory {

    MORTGAGE("Mortgage"),
    RENT("Rent"),
    CAR_PAYMENT("Car Payment"),
    MISC_ITEM("Misc. Item"),
    CREDIT_CARD("Credit Card"),
    GROCERIES("Groceries"),
    FOOD_OUT("Food Out"),
    DONATION("Donation"),
    UTILITY("Utility"),
    DISCRETIONARY("Discretionary"),
    ONE_TIME("One Time"),
    OTHER("Other");

    private final String displayName;
    ChargeCategory (String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
