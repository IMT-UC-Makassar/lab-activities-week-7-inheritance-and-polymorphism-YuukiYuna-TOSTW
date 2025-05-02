package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private String LoanStatus = "Not Applied";

    public BusinessAccount(String accountPassword, String accountName, double balance){
        super(accountPassword, accountName, balance);
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
    public void onlineTransfer(double amount, String toAccount) {
        // implementasi transfer online
    }

    @Override
    public void calculateInterest() {
        balance += balance
         * 0.05; // 5% interest
    }

    @Override
    public void applyForLoan(double amount) {
        LoanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return LoanStatus;
    }
}

