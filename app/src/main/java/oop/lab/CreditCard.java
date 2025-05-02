package oop.lab;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String holderName) {
        super(cardNumber, holderName);
    }

    @Override
    public double getInterestRate() {
        return 15.0;
    }
}
