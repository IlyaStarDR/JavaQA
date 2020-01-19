package com.epam.homework4.additionalTask2;

import java.util.Scanner;

public class Pyramid {
    private int height;

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of pyramid:");
        setHeight(scanner.nextInt());
        System.out.printf("The result is: \n%s", getPyramid());
    }

    private String getPyramid() {
        String pyramid = "";

        int i = 0;
        int height = 1;

        while (i < getHeight()) {
            int j = getHeight();
            while (j > i + 1) {
                pyramid += " ";
                j--;
            }
            j = i;
            while (j >= 0) {
                pyramid += height++;
                j--;
            }
            height = 1;
            i++;
            pyramid += "\n";
        }
        return pyramid;
    }

    private int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }
}
