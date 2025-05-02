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

    public String getOwner() {
        return accountName;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountName + "(" + accountPassword + ") withdraw: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public void transferFunds(double amount, String accDestination) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer to: " + accDestination + " = " + amount);
            System.out.println("Balance: " + balance);
        } else {
            throw new IllegalArgumentException("Not enough balance");
        }
    }

    public void payBills(double amount) {
        withdraw(amount);
    }

    public abstract void calculateInterest(); // Polymorphic behavior
}



