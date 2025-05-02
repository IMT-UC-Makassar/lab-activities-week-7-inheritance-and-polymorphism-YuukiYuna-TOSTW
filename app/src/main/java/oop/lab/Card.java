package oop.lab;

public abstract class Card {
    protected String cardNumber;
    protected String cardName;

    public Card (String cardNumber, String cardName){
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    public abstract double getInterestRate();
}
