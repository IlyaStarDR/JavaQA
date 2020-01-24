package com.epam.homework5.additionalTask2;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ConcatArray {
    private int[] firstArr;
    private int[] secondArr;
    private int lengthOfFirst;
    private int lengthOfSecond;

    public void process() {
        System.out.println("Enter length of 1 array: ");
        initFirstArray();
        setValuesOfArray(firstArr, lengthOfFirst);
        printArray(firstArr);
        System.out.println("Enter length of 2 array: ");
        initSecondArray();
        setValuesOfArray(secondArr, lengthOfSecond);
        printArray(secondArr);
        System.out.println("Third array is: ");
        printArray(getThirdArray());
    }

    private int[] getThirdArray() {
        int[] thirdArray = new int[lengthOfFirst + lengthOfSecond];
        System.arraycopy(firstArr, 0, thirdArray, 0, firstArr.length);
        System.arraycopy(secondArr, 0, thirdArray, firstArr.length, secondArr.length);
        return thirdArray;
    }

    private void initFirstArray() {
        Scanner scanner = new Scanner(System.in);
        setLengthOfFirst(scanner.nextInt());
        setFirstArr(new int[lengthOfFirst]);
    }

    private void initSecondArray() {
        Scanner scanner = new Scanner(System.in);
        setLengthOfSecond(scanner.nextInt());
        setSecondArr(new int[lengthOfSecond]);
    }

    private void setValuesOfArray(int[] array, int length) {
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

    public int getLengthOfFirst() {
        return lengthOfFirst;
    }

    public void setLengthOfFirst(int lengthOfFirst) {
        this.lengthOfFirst = lengthOfFirst;
    }

    public int getLengthOfSecond() {
        return lengthOfSecond;
    }

    public void setLengthOfSecond(int lengthOfSecond) {
        this.lengthOfSecond = lengthOfSecond;
    }
}
