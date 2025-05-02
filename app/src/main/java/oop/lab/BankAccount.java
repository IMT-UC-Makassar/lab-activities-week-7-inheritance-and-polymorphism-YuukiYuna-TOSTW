package oop.lab;

public abstract class BankAccount {
    protected String accountPassword;
    protected String accountName;
    protected double money;

    public BankAccount (String accountPassword, String accountName, double money) {
        this.accountPassword = accountPassword;
        this.accountName = accountName;
        this.money = money;
    }

    public double getBalance() {
        return money;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        money += amount;
    }

    public void withdraw(double amount) {
        if (amount > money) throw new IllegalArgumentException("Insufficient funds");
        money -= amount;
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


