package com.epam.homework8.menu;

import com.epam.homework8.books.Book;
import com.epam.homework8.books.Books;
import com.epam.homework8.exception.EmptyArrayRuntimeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Books books;

    public Menu(Books books) {
        this.books = books;
    }

    public void menuUser() throws CloneNotSupportedException {
        Scanner in = new Scanner(System.in);
        Books booksCloned = getClonedBook();

        System.out.println("menu");

        System.out.println("1 - show all books");
        System.out.println("2 - add a book");
        System.out.println("3 - change price up");
        System.out.println("4 - change price down");
        System.out.println("5 - search an author");
        System.out.println("6 - search a year");
        System.out.println("7 - sort books by author");
        System.out.println("8 - sort books by publishing house");
        System.out.println("9 - sort books by price");
        System.out.println("10 - exit");

        int choice = 0;
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            System.out.println("Enter numbers from 1 to 10");
            menuUser();
        }


        switch (choice) {
            case 1:
                try {
                    books.viewAll();
                } catch (EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                addBookViaScanner();
                books.viewAll();
                break;
            case 3:
                try {
                    System.out.println("Enter percent to increase price");
                    books.changePrice(in.nextDouble(), '+');
                    books.viewAll();
                } catch (IllegalArgumentException | EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                try {
                    System.out.println("Enter percent to decrease price");
                    books.changePrice(in.nextDouble(), '-');
                    books.viewAll();
                } catch (IllegalArgumentException | EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                try {
                    System.out.println("Enter full name of author");
                    in.nextLine();
                    books.searchAuthor(in.nextLine()).viewAll();
                } catch (EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 6:
                try {
                    System.out.println("Enter year of book publishing");
                    books.searchYear(in.nextInt()).viewAll();
                } catch (EmptyArrayRuntimeException | InputMismatchException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 7:
                try {
                    booksCloned.getNameOfAuthorCompared();
                    booksCloned.viewAll();
                } catch (EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 8:
                try {
                    booksCloned.getPublishingHouseCompared();
                    booksCloned.viewAll();
                } catch (EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 9:
                try {
                    booksCloned.getPriceCompared();
                    booksCloned.viewAll();
                } catch (EmptyArrayRuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 10:
                System.exit(0);
        }
        menuUser();

    }

    private Books getClonedBook() throws CloneNotSupportedException {
        return books.clone();
    }

    private void addBookViaScanner() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter id, name of book, name of author, " +
                    "publishing house, year of publishing, number of pages, price of book\n");
            String[] book = in.nextLine().split(",");
            books.add(new Book(Integer.parseInt(book[0]), book[1], book[2], book[3],
                    Integer.parseInt(book[4]), Integer.parseInt(book[5]), Double.parseDouble(book[6])));
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Wrong input try again");
        }
    }
}
