package org.example;
import java.util.ArrayList;
import java.util.List;


public class Main {
  public static void main(String[] args) {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new SavingsAccount("Izzah", 500.0, 50.0, 0.02));
    accounts.add(new CurrentAccount("Amy", 800.0, 100.0, 300.0));

    for (BankAccount account : accounts) {
      System.out.println(account);
    }
  }
}
