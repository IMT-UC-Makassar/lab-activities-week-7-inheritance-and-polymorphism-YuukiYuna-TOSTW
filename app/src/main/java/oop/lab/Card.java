package oop.lab;

public abstract class Card {
    protected String cardNumber;
    protected String holderName;

    public Card(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public abstract double getInterestRate();
}
