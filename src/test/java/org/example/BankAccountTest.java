package org.example;

// JUnit 5 imports
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Izzah", 100.0, 10.0);
    }

    @Test
    public void testInitialBalance() {
        Assertions.assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(50.0);
        Assertions.assertEquals(150.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawWithinLimit() {
        account.withdraw(40.0);
        Assertions.assertEquals(60.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawBelowMinimumBalance() {
        // Use assertThrows to check for an exception
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.withdraw(95.0));
    }
}
