package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountName;
    protected double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public void transferFunds(double amount, String toAccount) {
        withdraw(amount); // Simulasi saja
    }

    public void payBills(double amount) {
        withdraw(amount);
    }

    public abstract void calculateInterest(); // Polymorphic method
}
