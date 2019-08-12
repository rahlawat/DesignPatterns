package com.vapasi.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/20");
        amexCard.setCvv("123");

        System.out.println("Is valid amex: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("3791858834642832");
        amexCard2.setDate("04/20");
        amexCard2.setCvv("123");

        System.out.println("Is valid amex: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4791858834642832");
        visaCard.setDate("04/20");
        visaCard.setCvv("123");

        System.out.println("Is valid visa: " + visaCard.isValid());
    }
}
