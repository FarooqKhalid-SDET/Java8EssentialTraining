package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);

        switch (monthNumber){
            case 1:
                System.out.println("This is the Jan");
                break;
            case 2:
                System.out.println("This is the Feb");
                break;
            case 3:
                System.out.println("This is the Mar");
                break;
            default:
                System.out.println("Another month");

        }

    }

}
