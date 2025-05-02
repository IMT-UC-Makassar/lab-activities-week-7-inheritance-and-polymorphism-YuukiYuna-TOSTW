package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount (String accountPassword, String accountName, double balanced) {
        super (accountPassword, accountName, balanced);
    }
    @Override
    public void deposit(double amount) {
        balanced += amount;
    }

    @Override
    public void withdraw(double amount) {
        balanced -= amount;
    }

    @Override
    public void calculateInterest() {
        balanced += balanced * 0.02; // 2% interest
    }

    @Override
    public void onlineTransfer(double amount, String toAccount){
        
    }

}