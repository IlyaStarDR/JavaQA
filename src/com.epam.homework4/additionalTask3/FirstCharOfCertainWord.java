package com.epam.homework4.additionalTask3;

import java.util.Scanner;

public class FirstCharOfCertainWord {
    private String line;
    private int numberOfWord;

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line:");
        setLine(scanner.nextLine());                // setting value of line
        System.out.println("Enter number of word");
        setNumberOfWord(scanner.nextInt());         // setting number of word
        System.out.printf("The result is: \n%c", firstChar());            // output result
    }

    private char firstChar() {
        String[] arrOfWords = getLine().split(" ");   // splits a string into an array of words
        return arrOfWords[getNumberOfWord() - 1].charAt(0); // returns first char of n word
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
