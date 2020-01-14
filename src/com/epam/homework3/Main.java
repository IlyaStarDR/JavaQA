package com.epam.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of TASK: ");
        int numOfTask = scanner.nextInt();
        switch (numOfTask) {
            case 1:
                System.out.println("FIRST FIGURE:");
                firstTask();
                break;
            case 2:
                System.out.println("SECOND FIGURE:");
                secondTask();
                break;
            case 3:
                System.out.println("THIRD FIGURE:");
                thirdTask();
                break;
            case 4:
                System.out.println("FIFTH FIGURE:");
                fifthTask();
                break;
        }
    }


    public static void firstTask() {

        int i = 0;
        while (i < 5) {
            int j = i;
            while (j >= 0) {
                System.out.print("*");
                j--;
            }
            i++;
            System.out.println();
        }
        int k = 5;
        while (k > 0) {
            int j = k;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            k--;
            System.out.println();
        }
    }

    public static void secondTask() {
        int k = 5;
        while (k > 0) {
            int j = 5;
            while (j > k) {
                System.out.print(" ");
                j--;
            }
            j = k;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            k--;
            System.out.println();
        }
    }

    public static void thirdTask() {

        int i = 0;
        while (i < 5) {
            int j = 5;
            while (j > i + 1) {
                System.out.print(" ");
                j--;
            }
            j = i;
            while (j >= 0) {
                System.out.print("*");
                j--;
            }
            i++;
            System.out.println();
        }
    }

    private static void fourthTask() {
        thirdTask();
        secondTask();

    }

    private static void fifthTask() {
        additionalToFifthTask();
        additionalToFifthTask();
    }

    public static void additionalToFifthTask() {
        int i = 0;
        while (i < 5) {
            int j = 5;
            while (j > i + 1) {
                System.out.print(" ");
                j--;
            }
            j = i;
            while (j >= 0) {
                System.out.print("**");
                j--;
            }
            i++;
            System.out.println();
        }

    }
}
