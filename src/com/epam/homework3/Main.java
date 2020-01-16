package com.epam.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of triangle:");
        int length = scanner.nextInt();

        System.out.println("Enter symbol:");
        char symbol = scanner.next().charAt(0);

        System.out.println("Enter number of TASK: ");
        int numOfTask = scanner.nextInt();

        switch (numOfTask) {
            case 1:
                System.out.println("FIRST FIGURE:");
                firstTask(length, symbol);
                break;
            case 2:
                System.out.println("SECOND FIGURE:");
                secondTask(length, symbol);
                break;
            case 3:
                System.out.println("THIRD FIGURE:");
                thirdTask(length, symbol);
                break;
            case 4:
                System.out.println("FOURTH FIGURE:");
                fourthTask(length, symbol);
                break;
            case 5:
                System.out.println("FIFTH FIGURE:");
                fifthTask(length, symbol);
                break;
        }
    }


    public static void firstTask(int length, char symbol) {
        int i = 0;
        while (i < length) {
            int j = i;
            while (j >= 0) {
                System.out.print(symbol);
                j--;
            }
            i++;
            System.out.println();
        }

        int k = length;
        while (k > 0) {
            int j = k;
            while (j > 0) {
                System.out.print(symbol);
                j--;
            }
            k--;
            System.out.println();
        }
    }

    public static void secondTask(int length, char symbol) {
        int i = length;
        while (i > 0) {
            int j = length;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            j = i;
            while (j > 0) {
                System.out.print(symbol);
                j--;
            }
            i--;
            System.out.println();
        }
    }

    public static void thirdTask(int length, char symbol) {
        int i = 0;
        while (i < length) {
            int j = length;
            while (j > i + 1) {
                System.out.print(" ");
                j--;
            }
            j = i;
            while (j >= 0) {
                System.out.print(symbol);
                j--;
            }
            i++;
            System.out.println();
        }
    }

    private static void fourthTask(int length, char symbol) {
        thirdTask(length, symbol);
        secondTask(length, symbol);

    }

    private static void fifthTask(int length, char symbol) {
        additionalToFifthTask(length, symbol);
        additionalToFifthTask(length, symbol);
    }

    public static void additionalToFifthTask(int length, char symbol) {
        int i = 0;
        while (i < length) {
            int j = length;
            while (j > i + 1) {
                System.out.print(" ");
                j--;
            }
            j = i;
            while (j >= 0) {
                System.out.printf("%c%c", symbol, symbol);
                j--;
            }
            i++;
            System.out.println();
        }

    }
}
