package com.github.SecretSantaCalculator;

public class Main {
    public static void main(String[] args) {
        SecretSanta secretSanta = new SecretSanta();
        secretSanta.addName("This");
        secretSanta.addName("Might");
        secretSanta.addName("Actually");
        secretSanta.addName("Work");
        secretSanta.addName("But");
        secretSanta.addName("Probably");
        secretSanta.addName("Not");
        secretSanta.addName("You");
        secretSanta.addName("Know");
        System.out.println(secretSanta.partnerData);
        secretSanta.calculatePartners();
        System.out.println(secretSanta.calculatePartners().showPartnerData());
    }
}
