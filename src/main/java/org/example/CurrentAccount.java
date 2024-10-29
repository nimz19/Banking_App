package org.example;

public class CurrentAccount extends BankAccount {
    private double MaxWithdrawalAmount;

    public CurrentAccount(String AccountHolderName, double Balance, double MinimumBalance, double MaxWithdrawalAmount) {
        super(AccountHolderName, Balance, MinimumBalance);
        this.MaxWithdrawalAmount= MaxWithdrawalAmount;

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= MaxWithdrawalAmount) {
            super.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Cannot withdraw more than maximum allowed.");

        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "MaxWithdrawalAmount=" + MaxWithdrawalAmount +
                '}';
    }
}
