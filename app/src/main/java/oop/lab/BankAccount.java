package oop.lab;

public abstract class BankAccount {
    protected String accountPassword;
    protected String accountName;
    protected double balance;

    public BankAccount (String accountPassword, String accountName, double balance) {
        this.accountPassword = accountPassword;
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
        if (balance > amount){ 
        throw new IllegalArgumentException("Insufficient funds");
    }
    if (amount <= 0) {
        throw new IllegalArgumentException("Withdraw amount must be positive");
        }
    }   

    public void transferFunds(double amount, String toAccount) {
        withdraw(amount);
        // Simulasi: transfer berhasil
    }

    public void payBills(double amount) {
        withdraw(amount);
    }

    public abstract void calculateInterest(); // Polymorphic behavior
    }



