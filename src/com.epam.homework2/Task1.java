package com.epam.homework2;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class Task1 {
    private int number;
    private int reverseNumber;

    public void reverseNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TASK 1");
        System.out.println("Write down a number: ");
        setNumber(scanner.nextInt());
        StringBuilder current = new StringBuilder(String.valueOf(getNumber()));
        current.reverse();
        setReverseNumber(Integer.parseInt(current.toString()));

    }

    public int difference() {
        return getNumber() - getReverseNumber();
    }

    public void process() {
        reverseNum();
        System.out.printf("%d - %d = %d \n", getNumber(), getReverseNumber(), difference());

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReverseNumber() {
        return reverseNumber;
    }

    public void setReverseNumber(int reverseNumber) {
        this.reverseNumber = reverseNumber;
    }
}
