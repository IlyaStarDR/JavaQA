package com.epam.homework4.additionalTask1;

import java.util.Scanner;

public class ReverseLastTwoNumbers {
    private int number;             // variable of int

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int number:");
        setNumber(scanner.nextInt());                       // setting value of int via scanner
        System.out.printf("The result is: \n%s",            // printing the result
                getReversedTwoLastNumbers());
    }

    private String getReversedTwoLastNumbers() {

        StringBuilder numberToString = new StringBuilder(String.valueOf(getNumber()));  // parsing int to StringBuilder
        if (numberToString.length() == 1) {
            return numberToString.toString();
        }
        return numberToString.reverse().substring(0, 2);                                // reverse string and return two first numbers
    }


    public int getNumber() { // getter
        return number;
    }

    public void setNumber(int number) { // setter
        this.number = number;
    }
}
