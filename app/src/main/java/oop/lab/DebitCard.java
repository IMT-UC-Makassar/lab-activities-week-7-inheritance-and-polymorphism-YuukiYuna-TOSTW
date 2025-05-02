package oop.lab;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String holderName) {
        super(cardNumber, holderName);
    }

    @Override
    public double getInterestRate() {
        return 0.0;
    }
}
