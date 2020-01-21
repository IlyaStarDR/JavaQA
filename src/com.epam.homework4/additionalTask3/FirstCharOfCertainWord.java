package com.epam.homework4.additionalTask3;

import java.util.Scanner;

public class FirstCharOfCertainWord {
    private String line;
    private int numberOfWord;

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line:");
        setLine(scanner.nextLine());
        System.out.println("Enter number of word");
        setNumberOfWord(scanner.nextInt());
        if (splittedLine(line).length < numberOfWord || numberOfWord < 0) {
            System.out.println("False number of word!!!");
        }
        else {
            System.out.printf("The result is: \n%c", firstChar());
        }
    }

    private char firstChar() {
        String[] arrOfWords = splittedLine(line);
        return arrOfWords[numberOfWord - 1].charAt(0);
    }

    private String[] splittedLine(String line) {
        return line.split("\u0020");
    }

    private String getLine() {
        return line;
    }

    private void setLine(String line) {
        this.line = line;
    }

    private int getNumberOfWord() {
        return numberOfWord;
    }

    private void setNumberOfWord(int numberOfWord) {
        this.numberOfWord = numberOfWord;
    }
}
