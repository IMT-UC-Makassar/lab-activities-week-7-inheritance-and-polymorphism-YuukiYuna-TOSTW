package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount (String accountPassword, String accountName, double money) {
        super (accountPassword, accountName, money);
    }
    @Override
    public void deposit(double amount) {
        money += amount;
    }

    @Override
    public void withdraw(double amount) {
        money -= amount;
    }

    @Override
    public void calculateInterest() {
        money += money * 0.02; // 2% interest
    }

    @Override
    public void onlineTransfer(double amount, String toAccount){
        
    }

}