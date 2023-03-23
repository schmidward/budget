package org.example.helperFunctionTests;

import org.example.Account;
import org.example.Charge;
import org.example.ChargeCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class miscHelpersTest {

    private Charge testData1;
    private Account dummyAccount;
    @Test
    public void dateTransformTest(){
        dummyAccount = new Account("Second Bank", "Checking", "03-04-2021");
        testData1 = new Charge(35, "06-24-2022", ChargeCategory.GROCERIES, "Beep boop", dummyAccount);
        String spec = "The date is properly transformed from MM-DD-YYYY to YYYY-MM-DD";
        Assertions.assertEquals("2022-06-24", testData1.dateTransform(), spec);
    }
}
