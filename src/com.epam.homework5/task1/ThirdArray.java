package com.epam.homework5.task1;

import java.util.Scanner;

public class ThirdArray {
    private int[] firstArr;
    private int[] secondArr;
    private int length;

    public void process() {
        System.out.println("Enter length of arrays: ");
        initArray();
        setValuesOfArray(firstArr);
        setValuesOfArray(secondArr);
        System.out.println("First array is: ");
        printArray(firstArr);
        System.out.println("Second array is: ");
        printArray(secondArr);
        System.out.println("Third array is: ");
        printArray(getThirdArray());
    }

    private int[] getThirdArray() {
        int[] thirdArray = new int[length];
        for (int i = 0; i < length; i++) {
            thirdArray[i] = firstArr[i] + secondArr[i];
        }
        return thirdArray;
    }

    private void initArray() {
        Scanner scanner = new Scanner(System.in);
        setLength(scanner.nextInt());
        setFirstArr(new int[length]);
        setSecondArr(new int[length]);
    }

    private void setValuesOfArray(int[] array) {
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
    }

    private void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public int[] getFirstArr() {
        return firstArr;
    }

    public void setFirstArr(int[] firstArr) {
        this.firstArr = firstArr;
    }

    public int[] getSecondArr() {
        return secondArr;
    }

    public void setSecondArr(int[] secondArr) {
        this.secondArr = secondArr;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
