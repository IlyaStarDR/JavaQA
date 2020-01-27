package com.epam.homework6;

import java.util.Scanner;

public class Books {
    private Book[] listOfBooks;
    private int counter;

    public Books(int length) {
        if (length >= 0) {
            listOfBooks = new Book[length];
        } else {
            System.out.println("The length of array is negative");
        }
    }

    public void viewAll() {
        for (Book element : listOfBooks) {
            if (element != null) {
                element.view();
            }
        }
    }

    public void add(Book book) {
        if (listOfBooks.length > counter) {
            listOfBooks[counter] = book;
            counter++;
        } else {
            System.out.println("Array is full");
        }
    }

    public void changePriceUp() {
        Scanner scanner = new Scanner(System.in);
        double percent = scanner.nextDouble();
        for (Book element : listOfBooks) {
            if (element != null) {
                element.setPrice(element.getPrice() + element.getPrice() * percent / 100);
            }
        }
    }

    public void changePriceDown() {
        Scanner scanner = new Scanner(System.in);
        double percent = scanner.nextDouble();
        for (Book element : listOfBooks) {
            if (element != null) {
                element.setPrice(element.getPrice() - element.getPrice() * percent / 100);
            }
        }
    }

    public Books searchAuthor() {
        Books books = new Books(listOfBooks.length);
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        for (Book element : listOfBooks) {
            if (element != null && element.getAuthor().equals(author)) {
                books.add(element);
            }
            if (element == null) {
                counter++;
                if (counter == listOfBooks.length) {
                    System.out.println("List of books is empty");
                }
            }

        }
        return books;
    }

    public Books searchYear() {
        int counter = 0;
        Books books = new Books(listOfBooks.length);
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        for (Book element : listOfBooks) {
            if (element != null && element.getYearOfPublishing() > year) {
                books.add(element);
            }
            if (element == null) {
                counter++;
                if (counter == listOfBooks.length) {
                    System.out.println("List of books is empty");
                }
            }
        }

        return books;
    }
}
