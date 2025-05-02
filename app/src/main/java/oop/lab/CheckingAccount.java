package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{
    public CheckingAccount (String accountPassword, String accountName, double balance){
        super (accountPassword, accountName, balance);
    }

    @Override
    public void deposit(double amount){
    balance += amount;
    }

    @Override
    public void withdraw(double amount){
    balance -= amount;
    }

    @Override
    public void calculateInterest() {
    }

    @Override
    public void onlineTransfer(double amount, String toAccount){
    }
}