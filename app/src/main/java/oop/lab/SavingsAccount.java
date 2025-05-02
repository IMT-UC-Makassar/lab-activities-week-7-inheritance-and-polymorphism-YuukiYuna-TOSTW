package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {

    public SavingsAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.02;
        balance += interest;
    }

    @Override
    public void transferFunds(double amount, String toAccount) {
        super.transferFunds(amount, toAccount);
    }

    @Override
    public void payBills(double amount) {
        super.payBills(amount);
    }
}
