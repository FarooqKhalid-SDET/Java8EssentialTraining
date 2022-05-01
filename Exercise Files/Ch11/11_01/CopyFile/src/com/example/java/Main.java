package com.example.java;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        try(FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter= new FileWriter(targetFile);){

            while (true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                } else {
                    fileWriter.write(line + "\n");
                }
            }
            System.out.println("File copied!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
