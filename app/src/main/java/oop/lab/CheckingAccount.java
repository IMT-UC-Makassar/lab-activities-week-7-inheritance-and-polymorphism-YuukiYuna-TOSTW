package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    @Override
    public void calculateInterest() {
        // Tidak ada bunga
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
