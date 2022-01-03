package com.gambler;

public class Gambler {
    public static int INITIAL_STAKE = 100;
    public static int BET_AMOUNT = 1;
    public static void main(String[] args) {
        System.out.println("Welcome to gambler simulation");
        System.out.println("initial amount is "+INITIAL_STAKE +" Daily bet amount "+BET_AMOUNT);
        int allAmount=100;
        int minStack=(allAmount*50)/100;
        int maxStack=allAmount+minStack;
        for (int i=1; i<21;i++) {
            int totalAmount = INITIAL_STAKE;
            while (totalAmount < maxStack && totalAmount > minStack) {
                double randomNumber = Math.random();
                System.out.println(i + "Random number is :" + randomNumber);
                if (randomNumber > 0.5) {
                    System.out.println(i + " day gambler won the bet total amount is " + totalAmount);
                    totalAmount += BET_AMOUNT;
                } else {
                    System.out.println(i + " day gambler lose the bet total amount is " + totalAmount);
                    totalAmount -= BET_AMOUNT;
                }
            }
            System.out.println(i + " day Gambler resign the bet after that he has total amount " + totalAmount);
            if (totalAmount == maxStack) {
                System.out.println("total amount won at " +i +" is " +(totalAmount-INITIAL_STAKE));
            }
            else {
                System.out.println("total amount lost at " +i +" is " +(INITIAL_STAKE-totalAmount));
            }
        }
    }
}