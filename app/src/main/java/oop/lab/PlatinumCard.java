package oop.lab;

public class PlatinumCard extends Card {
    public PlatinumCard( String cardNumber, String cardName){
        super(cardNumber, cardName);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
