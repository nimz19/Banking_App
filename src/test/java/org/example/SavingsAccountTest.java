package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    private SavingsAccount savingsAccount;

    @BeforeEach
    public void setUp() {
        savingsAccount = new SavingsAccount("Alice", 500.0, 50.0, 0.02); // 2% interest rate
    }

    @Test
    public void testInitialBalance() {
        Assertions.assertEquals(500.0, savingsAccount.getBalance(), 0.0);
    }

    @Test
    public void testApplyInterest() {
        savingsAccount.applyInterest();
        Assertions.assertEquals(510.0, savingsAccount.getBalance(), 0.0); // 500 + (500 * 0.02)
    }

    @Test
    public void testDeposit() {
        savingsAccount.deposit(100.0);
        Assertions.assertEquals(600.0, savingsAccount.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawWithinLimit() {
        savingsAccount.withdraw(400.0);
        Assertions.assertEquals(100.0, savingsAccount.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawBelowMinimumBalance() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> savingsAccount.withdraw(460.0));
    }
}
