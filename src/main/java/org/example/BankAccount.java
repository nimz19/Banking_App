package org.example;

public class BankAccount {
    private String AccountHolderName;
    private double Balance;
    private double MinimumBalance;

    public BankAccount(String accountHolderName, double balance, double minimumBalance) {
        AccountHolderName = accountHolderName;
        Balance = balance;
        MinimumBalance = minimumBalance;
    }

    public double getBalance() {
        return Balance;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    //should test the following two methods
    //method to deposit and update amount
    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
        }
    }

    //method to withdraw
    public void withdraw(double amount) {
        if (Balance - amount >= MinimumBalance) {
            Balance -= amount;
        } else {
            throw new IllegalArgumentException("Cannot withdraw below minimum balance.");

        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountHolderName='" + AccountHolderName + '\'' +
                ", Balance=" + Balance +
                ", MinimumBalance=" + MinimumBalance +
                '}';
    }
}
