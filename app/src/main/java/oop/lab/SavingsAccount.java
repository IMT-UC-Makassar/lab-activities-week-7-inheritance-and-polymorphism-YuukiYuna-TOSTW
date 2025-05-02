package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount (String accountPassword, String accountName, double balance) {
        super (accountPassword, accountName, balance);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void calculateInterest() {
        balance += balance * 0.02; // 2% interest
    }

    @Override
    public void onlineTransfer(double amount, String toAccount){
        
    }

}