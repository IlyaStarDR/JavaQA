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

    private String getReverseBinary() {   // method returns reverse binary number
        String reverseBinary = "";
        int currDec = getDecimal();
        while (currDec >= 1) {
            reverseBinary += currDec % 2;
            currDec /= 2;
        }
        return reverseBinary;
    }

    private String getBinary() {          // method returns right binary
        String binary = "";
        int i = getReverseBinary().length() - 1;
        while (i >= 0) {
            binary += getReverseBinary().charAt(i);
            i--;
        }
        return binary;
    }

    public int getDecimal() { // getter
        return decimal;
    }

    public void setDecimal(int decimal) { // setter
        this.decimal = decimal;
    }
}
