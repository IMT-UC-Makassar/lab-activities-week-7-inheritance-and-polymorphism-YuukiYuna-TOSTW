package oop.lab;

public class PlatinumCard extends Card {

    public PlatinumCard(String cardNumber, String holderName) {
        super(cardNumber, holderName);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
