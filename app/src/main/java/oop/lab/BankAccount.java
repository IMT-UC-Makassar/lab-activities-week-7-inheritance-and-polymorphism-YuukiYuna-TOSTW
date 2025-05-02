package oop.lab;

public abstract class BankAccount {
    protected String accountPassword;
    protected String accountName;
    protected double balanced;

    public BankAccount (String accountPassword, String accountName, double balanced) {
        this.accountPassword = accountPassword;
        this.accountName = accountName;
        this.balanced = balanced;
    }

    public double getBalance() {
        return balanced;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balanced += amount;
    }

    public void withdraw(double amount) {
        if (balanced > amount){
        balanced -= amount; 
    } else {
        throw new IllegalArgumentException("Insufficient funds");
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



