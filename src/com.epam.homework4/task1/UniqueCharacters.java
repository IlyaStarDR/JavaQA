package com.epam.homework4.task1;

import java.util.Scanner;

public class UniqueCharacters {
    private String string; // initialization variable of string

    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line:");
        setString(scanner.nextLine());                          // setting value of string via scanner
        System.out.println("Unique chars of line are:");
        System.out.println(getUniqueCharacters(getString()));   // printing the result
    }

//    private String getUniqueCharacters(String string) {       // method using for loops
//        String currentString = string;
//        char currentChar;
//        for (int i = 0; i < string.length(); i++) {
//            currentChar = string.charAt(i);
//            for (int j = i + 1; j < string.length(); j++)
//                if (currentChar == string.charAt(j)) {
//                    currentString = currentString.replace(string.charAt(j), '\020');
//                }
//        }
//        return currentString.replaceAll("\020", "");
//    }

    private String getUniqueCharacters(String string) { // method using while loops
        String currentString = string;                  // initialization of temporary string
        char currentChar;                               // and char values
        int i = 0;                                      // increment of external loop
        while (i < string.length()) {
            currentChar = string.charAt(i);
            int j = i + 1;                              // increment of internal loop
            while (j < string.length()) {
                if (currentChar == string.charAt(j)) {  // comparing chars in string
                    currentString = currentString.replace(string.charAt(j), '\u0020')
                            .replaceAll(" ", ""); // replacing identical characters with a spaces
                }                                                   // and spaces with empty char
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
