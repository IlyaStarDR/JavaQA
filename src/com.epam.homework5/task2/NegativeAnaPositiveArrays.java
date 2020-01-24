package com.epam.homework5.task2;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeAnaPositiveArrays {
    private int[] array;
    private int length;

    public void process() {
        System.out.println("Enter length of arrays: ");
        initArray();
        setValuesOfArray(array);
        System.out.println("Initial array");
        printArray(array);
        System.out.println("Positive array:");
        printArray(getNegativeArray());
        System.out.println("Negative array:");
        printArray(getPositiveArray());
    }

    private int[] getPositiveArray() {
        int[] positiveArray = new int[length];
        int counter = 0;
        for (int element : array) {
            if (element > 0) {
                positiveArray[counter++] = element;
            }
        }
        return Arrays.copyOf(positiveArray, counter);
    }

    private int[] getNegativeArray() {
        int[] negativeArray = new int[length];
        int counter = 0;
        for (int element : array) {
            if (element < 0) {
                negativeArray[counter++] = element;
            }
        }
        return Arrays.copyOf(negativeArray, counter);
    }

    private void setValuesOfArray(int[] array) {
        for (int i = 0; i < length; i++) {
            array[i] = (int) ((Math.random() * 200 + 1) - 100);
        }
    }

    private void initArray() {
        Scanner scanner = new Scanner(System.in);
        setLength(scanner.nextInt());
        setArray(new int[length]);
    }

    private void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
