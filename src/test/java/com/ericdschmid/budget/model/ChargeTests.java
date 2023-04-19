package com.ericdschmid.budget.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChargeTests {

    private Account accountNoArg;
    private Account checkingAccount;
    private Account creditCard1;
    private Charge charge1;
    private Charge charge2;
    private Charge charge3;


    @BeforeEach
    public void init() {
        //TEST DATA IS DUMMY DATA
//        accountNoArg = new Account();
//        checkingAccount = new Account("First Bank", "checking", "05-20-2019");
//        creditCard1 = new Account("American Express", "credit", "03-20-2020");
        charge1 = new Charge(32.59, "06-24-2020", ChargeTag.GROCERIES, "Kroger", "creditCard1");
        charge2 = new Charge(44.95, "07-25-2021", ChargeTag.UTILITY, "Gas bill", "creditCard1");
        charge3 = new Charge(425.67, "04-13-2020", ChargeTag.CREDIT_CARD, "American Express Bill", "checkingAccount");
    }

//    @Test
//    public void accountClassSetsIDProperly () {
//        String spec1 = "Account noarg constructor sets id to 1 without other passed values";
//        String spec2 = "Sequential accounts have different ids";
//        Assertions.assertEquals(1, accountNoArg.getId(), spec1);
//        Assertions.assertNotEquals(accountNoArg.getId(), checkingAccount.getId(), spec2);
//    }

    @Test
    public void chargeBaseClassExtendsCorrectly() {
        String spec1 = "charge properly sets id, amount, date, chargeCategory and dek";
        Assertions.assertEquals(32.59, charge1.getAmount(), spec1);
        Assertions.assertEquals("07-25-2021", charge2.getDate(), spec1);
        Assertions.assertEquals("Groceries", charge1.getChargeCategory().getDisplayName(), spec1);
        Assertions.assertEquals("Gas bill", charge2.getDek(), spec1);

    }

}
