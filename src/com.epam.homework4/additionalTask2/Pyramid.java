package com.epam.homework4.additionalTask2;

import java.util.Scanner;

public class Pyramid {
    private int height;

    public void process() {
        Scanner scanner = new Scanner(System.in);
        setHeight(scanner.nextInt());
        System.out.println(getPyramid());
    }

    private String getPyramid() {
        String pyramid;
//        if (getHeight() == 1) {
//            pyramid = "1";
//        }
        int i = 0;
        while (i < getHeight()){
            while (i < 2 * getHeight() - 1){
                
            }
        }

        return "";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
