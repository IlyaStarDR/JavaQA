package com.epam.homework4.task1;

import java.util.Scanner;

public class UniqueCharacters {
    private String string;

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line:");
        setString(scanner.nextLine());
        System.out.printf("Unique chars of line are: \n%s",
                getUniqueCharacters());
    }


    private String getUniqueCharacters() {
        String currentString = string;
        char currentChar;
        int i = 0;
        while (i < string.length()) {
            currentChar = string.charAt(i);
            int j = i + 1;
            while (j < string.length()) {
                if (currentChar == string.charAt(j)) {
                    currentString = currentString.replace(string.charAt(j), '\u0020')
                            .replaceAll("\u0020", "");
                }
                j++;
            }
            i++;
        }
        return currentString;
    }

    public String getString() { // getter
        return string;
    }

    public void setString(String string) { // setter
        this.string = string;
    }
}
