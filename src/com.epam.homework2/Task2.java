package com.epam.homework2;

import java.util.Scanner;

public class Task2 {
    public static final double GRAM_IN_ONE_POUND = 453.6;
    private double pounds;
    private double kilos;

    private void conversion() {
        setKilos(getPounds() * GRAM_IN_ONE_POUND / 1000);
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TASK 2");
        System.out.print("Write down pounds: ");
        setPounds(scanner.nextDouble());
        conversion();
        System.out.printf("%.4f pounds = %d kilos and %.3f grams\n", getPounds(), (int) getKilos(), getKilos() % 1);
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }
}
