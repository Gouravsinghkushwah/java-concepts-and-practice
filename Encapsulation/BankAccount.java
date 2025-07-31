package javaConceptsAndPractice.Encapsulation;


public class BankAccount {
    private double balance;

    public BankAccount(double initialAmount) {
        if (initialAmount >= 0) {
            this.balance = initialAmount;
        } else {
            throw new RuntimeException("You can not add negative Balance!!!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new RuntimeException("Deposit amount must be positive!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
