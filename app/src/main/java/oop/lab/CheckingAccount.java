package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{
    public CheckingAccount (String accountPassword, String accountName, double money){
        super (accountPassword, accountName, money);
    }

    @Override
    public void deposit(double amount){
    money += amount;
    }

    @Override
    public void withdraw(double amount){
    money -= amount;
    }

    @Override
    public void calculateInterest() {
    }

    @Override
    public void onlineTransfer(double amount, String toAccount){
    }
}