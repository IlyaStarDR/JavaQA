package com.epam.homework4.task2;

import java.util.Scanner;

public class DecimalToBinary {
    private int decimal;


    public void process() {
        System.out.println("Enter decimal number to convert to binary:");
        Scanner scanner = new Scanner(System.in);
        setDecimal(scanner.nextInt());                   // setting value of string via scanner
        System.out.printf("Result: \n%s", getBinary()); // printing the result
    }

    private String getBinary() {   // method returns binary number
        String reverseBinary = "";
        int currDec = decimal;
        while (currDec >= 1) {
            reverseBinary = (currDec % 2) + reverseBinary;
            currDec /= 2;
        }
        return reverseBinary;
    }


    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }
}
