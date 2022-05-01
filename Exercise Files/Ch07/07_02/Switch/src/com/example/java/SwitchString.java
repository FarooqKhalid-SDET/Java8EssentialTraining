package com.example.java;

import java.util.Scanner;

public class SwitchString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String input = sc.nextLine();

        switch (input){
            case "Jan":
                System.out.println("This is the 1 month");
                break;
            case "Feb":
                System.out.println("This is the 2 month");
                break;
            case "Mar":
                System.out.println("This is the 3 month");
                break;
            default:
                System.out.println("Another month");

        }

    }

}
