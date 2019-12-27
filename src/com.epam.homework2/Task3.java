package com.epam.homework2;

import java.util.Scanner;

public class Task3 {
    private double deposit;
    private int months;
    private double percents;
    private double profit;

    public void calcDeposit() {
        setProfit(getDeposit() * (1 + getPercents() * getMonths() / (12 * 100)));
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TASK 3");
        System.out.print("Deposit - ");
        setDeposit(scanner.nextDouble());
        System.out.print("Months - ");
        setMonths(scanner.nextInt());
        System.out.print("Percents - ");
        setPercents(scanner.nextDouble());
        calcDeposit();
        System.out.printf("%.3f profit - %.3f deposit for %d months with %.2f percents", getProfit(), getDeposit(), getMonths(), getPercents());


    }


    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getPercents() {
        return percents;
    }

    public void setPercents(double percents) {
        this.percents = percents;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
