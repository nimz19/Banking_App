package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrentAccountTest {
    private CurrentAccount currentAccount;

    @BeforeEach
    public void setUp() {
        currentAccount = new CurrentAccount("Bob", 800.0, 100.0, 300.0); // max withdrawal limit of 300
    }

    @Test
    public void testInitialBalance() {
        Assertions.assertEquals(800.0, currentAccount.getBalance(), 0.0);
    }

    @Test
    public void testDeposit() {
        currentAccount.deposit(200.0);
        Assertions.assertEquals(1000.0, currentAccount.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawWithinLimit() {
        currentAccount.withdraw(250.0);
        Assertions.assertEquals(550.0, currentAccount.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawExceedsMaxLimit() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> currentAccount.withdraw(350.0));
    }

    @Test
    public void testWithdrawBelowMinimumBalance() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> currentAccount.withdraw(750.0));
    }
}
