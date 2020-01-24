package com.epam.homework5.additionalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticMean {
    private int[] array;
    private int length;

    public void process() {
        System.out.println("Enter length of arrays: ");
        initArray();
        setValuesOfArray(array);
        System.out.println("Initial array is: ");
        printArray(array);
        System.out.println("Arithmetic mean: ");
        System.out.println(getArithmeticMean());
        System.out.println("Resulting array is: ");
        printArray(getNumbersLargerAM());

    }

    private int[] getNumbersLargerAM() {
        int[] resultingArray = new int[length];
        double arithmeticMean = getArithmeticMean();
        int counter = 0;
        for (int element : array) {
            if (element > arithmeticMean) {
                resultingArray[counter++] = element;
            }
        }
        return Arrays.copyOf(resultingArray, counter);
    }

    private double getArithmeticMean() {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    private void setValuesOfArray(int[] array) {
        for (int i = 0; i < length; i++) {
            array[i] = (int) ((Math.random() * 100 + 1));
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
