package org.example;

//Write tests for BankAccount Class Properties and Methods
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("Izzah", 100.0, 10.0);
    }

    @Test
    public void testInitialBalance() {
        Assert.assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(50.0);
        Assert.assertEquals(150.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawWithinLimit() {
        account.withdraw(40.0);
        Assert.assertEquals(60.0, account.getBalance(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawBelowMinimumBalance() {
        account.withdraw(95.0) //should throw an exception
    }
}
