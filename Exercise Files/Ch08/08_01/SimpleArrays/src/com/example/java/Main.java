package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints={9 , 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


        System.out.println("Array of strings");
        String[] colors={"Red", "Blue", "Green"};
        Arrays.sort(colors);
        for(String color: colors){
            System.out.println(color);
        }


        System.out.println("Setting an initial size");
        int[] size = new int[10];

        for (int i = 0; i < size.length; i++) {
            size[i] = i*100;
        }

        for (int value: size){
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(size, 5, copied, 0, 5);

        for (int value: copied){
            System.out.println(value);
        }

    }

}
