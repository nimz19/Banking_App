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

    @Test // checks if the initial balance is correctly set
    public void testInitialBalance() {
        Assertions.assertEquals(100.0, account.getBalance(), 0.0); //delta sets the allowable margin of error for comparison
    }

    @Test // verifies that depositing an amount correctly increases the balance
    public void testDeposit() {
        account.deposit(50.0); //deposits $50 into the account
        Assertions.assertEquals(150.0, account.getBalance(), 0.0);
    }

    @Test //ensures that withdrawing an amount within the balance works
    public void testWithdrawWithinLimit() {
        account.withdraw(40.0);
        Assertions.assertEquals(60.0, account.getBalance(), 0.0);
    }

    @Test //checks that withdrawing an amount below the minimum balance throws an IllegalArgumentException
    public void testWithdrawBelowMinimumBalance() {
        // Use assertThrows to check for an exception
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.withdraw(95.0));
    }
}
