package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private double loanAmount;
    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
        this.loanStatus = "None";
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.01;
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

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
        this.loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}
