package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private String LoanStatus = "Not Applied";

    public BusinessAccount(String accountPassword, String accountName, double money){
        super(accountPassword, accountName, money);
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
    public void onlineTransfer(double amount, String toAccount) {
        // implementasi transfer online
    }

    @Override
    public void calculateInterest() {
        money += money * 0.05; // 5% interest
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

