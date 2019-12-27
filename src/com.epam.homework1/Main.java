package com.epam.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("* * * *  * * * *       *       *        *");
        System.out.println("*        *     *     *   *     *  *   * *");
        System.out.println("* *      * * * *    *     *    *    *   *");
        System.out.println("*        *         * * * * *   *        *");
        System.out.println("* * * *  *        *         *  *        *");

        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        System.out.println("Write down a symbol");

        System.out.println("*     *  * * * *   *        *           * *       ".replace('*', a));
        System.out.println("*     *  *         *        *         *     *     ".replace('*', a));
        System.out.println("* * * *  * * * *   *        *        *       *    ".replace('*', a));
        System.out.println("*     *  *         *     *  *     *   *     *     ".replace('*', a));
        System.out.println("*     *  * * * *   * * * *  * * * *     * *       ".replace('*', a));

    }
}
