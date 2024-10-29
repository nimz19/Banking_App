package org.example;

public class SavingsAccount extends BankAccount {
    private double InterestRate;

    public SavingsAccount(String AccountHolderName, double Balance, double MinimumBalance, double InterestRate) {
        super(AccountHolderName, Balance, MinimumBalance);
        this.InterestRate = InterestRate;

    }

    public void applyInterest() {
        deposit(getBalance() * InterestRate);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "InterestRate=" + InterestRate +
                '}';
    }
}
