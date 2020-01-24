package com.epam.homework5.additionalTask3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicate {
    private int[] array;
    private int length;

    public void process() {
        System.out.println("Enter length of arrays: ");
        initArray();
        System.out.println("Enter array");
        setValuesOfArray(array);
        System.out.println("Initial array is: ");
        printArray(array);
        System.out.println("Resulting array is: ");
        printArray(getUpdatedArray());
    }

    private int[] getUpdatedArray() {
        int counter = 0;
        int min = getMin();
        int max = getMax();
        int[] updatedArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (array[i] != max && array[i] != min) {
                updatedArray[counter++] = array[i];
            }
        }
        return Arrays.copyOf(updatedArray, counter);
    }

    private int getMin() {
        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    private int getMax() {
        int max = array[0];
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    private void setValuesOfArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < length; i++) {
            array[counter++] = scanner.nextInt();
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
