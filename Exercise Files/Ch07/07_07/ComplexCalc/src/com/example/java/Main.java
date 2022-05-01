package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.print("Enter a number value: ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            double d1 = Double.parseDouble(input);
            System.out.print("Enter a number value: ");
            input = scan.nextLine();
            double d2 = Double.parseDouble(input);

            System.out.print("Choose an operation (+,-,*,/): ");
            input = scan.nextLine();

            switch (input){
                case "*":
                    System.out.println(d1 * d2);
                    break;
                case "/":
                    System.out.println(d1 / d2);
                    break;
                case "-":
                    System.out.println(d1 - d2);
                    break;
                case "+":
                    System.out.println(d1 + d2);
                    break;
                default:
                    System.out.println("Not a right operator:");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a numeric value:");
        }

    }
}
