package com.example.java;

public class Main {

    public static void main(String[] args) {

        int month = 15;

        if(month >= 1 && month <= 3){
            System.out.println("You're in quarter 1");
        } else if (month >= 4 && month <= 6) {
            System.out.println("You're in quarter 2");
        } else if (month >= 7 && month <= 9) {
            System.out.println("You're in quarter 3");
        } else if (month >= 10 && month <= 12) {
            System.out.println("You're in quarter 4");
        } else{
            System.out.println("Unknown/wrong month");
        }
    }
}
