package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{
    public CheckingAccount (String accountPassword, String accountName, double balanced){
        super (accountPassword, accountName, balanced);
    }

    @Override
    public void deposit(double amount){
    balanced += amount;
    }

    @Override
    public void withdraw(double amount){
    balanced -= amount;
    }

    @Override
    public void calculateInterest() {
    }

    @Override
    public void onlineTransfer(double amount, String toAccount){
    }
}