# Banking App

A simple Java-based Banking Application developed using Test-Driven Development (TDD) principles. This application provides functionality for creating and managing different types of bank accounts, with features for depositing, withdrawing, and applying specific account restrictions such as minimum balance and maximum withdrawal limits.

## Project Structure

This project follows a standard Maven project structure:

```plaintext
Banking_App/
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── example
│   │   │           ├── BankAccount.java
│   │   │           ├── SavingsAccount.java
│   │   │           ├── CurrentAccount.java
│   │   │           └── Main.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── org
│       │       └── example
│       │           ├── BankAccountTest.java
│       │           ├── SavingsAccountTest.java
│       │           └── CurrentAccountTest.java
│       └── resources

```

### Classes and Methods
#### BankAccount Properties:

balance: Double - Account balance.
minimumBalance: Double - Minimum allowable balance.
accountHolderName: String - Name of the account holder.
Methods:

deposit(double amount): Increases the balance by the given amount.
withdraw(double amount): Decreases the balance by the given amount, ensuring the balance doesn't drop below the minimum balance.

**SavingsAccount**
Additional Property:
interestRate: Double - Interest rate for the account.
Additional Method:
applyInterest(): Applies interest to the account based on the interestRate.

**CurrentAccount**
Additional Property:
maxWithdrawalAmount: Double - Maximum amount that can be withdrawn at one time.
Modified Withdraw Method:
Restricts withdrawals to the maxWithdrawalAmount.


**Testing** 

Tests are located in src/test/java/org/example and are written using JUnit 5. 

Key tests include:

BankAccountTest: Tests deposit, withdraw, and balance maintenance for the BankAccount class.

SavingsAccountTest: Verifies interest application functionality in SavingsAccount.

CurrentAccountTest: Checks that the withdrawal limit is enforced in CurrentAccount.
