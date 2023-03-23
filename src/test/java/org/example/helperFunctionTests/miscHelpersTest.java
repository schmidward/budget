package org.example.helperFunctionTests;

import org.example.Account;
import org.example.Charge;
import org.example.ChargeCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class miscHelpersTest {

    private Charge testData1;
    private Account dummyAccount;
    @BeforeEach
    public void init(){
        dummyAccount = new Account("Second Bank", "Checking", "03-04-2021");
        testData1 = new Charge(35, "06-24-2022", ChargeCategory.GROCERIES, "Beep boop", dummyAccount);
    }

    @Test
    public void dateTransformTest(){
        String spec = "The date is properly transformed from MM-DD-YYYY to YYYY-MM-DD";
        testData1.dateTransform();
        Assertions.assertEquals("2022-06-24", testData1.getDate(), spec);
    }

    @Test
    public void dateToIntegerTest(){
        String spec = "The date is properly transformed from MM-DD-YYYY to a YYYYMMDD integer";
        testData1.dateTransform();
        testData1.dateToInteger();
        Assertions.assertEquals(20220624, testData1.getIntDate(), spec);
    }


}
