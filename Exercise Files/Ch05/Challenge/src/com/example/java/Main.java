package com.example.java;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        String input1 = scan.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Enter a numeric value: ");
        String input2 = scan.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;
        System.out.println("The answer is " + result);

    }
}
