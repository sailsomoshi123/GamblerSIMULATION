package com.gambler;

public class Gambler {
    public static int INITIAL_STAKE = 100;
    public static int BET_AMOUNT = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to gambler simulation");
        System.out.println("initial amount is "+INITIAL_STAKE +" Daily bet amount "+BET_AMOUNT);
        double randomNumber = Math.random();
        System.out.println("Random number is :" +randomNumber);
        if (randomNumber>0.5){
            System.out.println("gambler won the bet");
        }else {
            System.out.println("gambler lose the bet");
        }
    }
}