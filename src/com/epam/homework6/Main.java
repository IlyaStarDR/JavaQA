package com.epam.homework6;

public class Main {
    public static void main(String[] args) {
        // overfilled array
        Books books = new Books(5);
        books.add(new Book(1, "Преданная революция", "Лев Давидович Троцкий", "- ", 1936, 189, 200));
        Book book = new Book(2, "Cтарик и Mоре", "Эрнест Хемингуэй", "Charles Scribner's Sons", 1936, 98, 145);
        books.add(book);
        books.add(new Book(3, "1984", "Джордж Оруэлл", "АСТ", 1948, 250, 435));
        books.add(new Book(4, "Harry Potter»", "Джоан Роулинг", "Bloomsbury Publishing", 1997, 402, 120));
        books.add(new Book(5, "Идиот", "Фёдор Достоевский", "АСТ", 1868, 800, 183.6));
        books.add(new Book(6, "Три товарища", "Эрих Мария Ремарк", "АСТ", 1936, 480, 142));
        System.out.println("Enter percent to increase the price");
        books.changePriceUp();
        books.viewAll();
        System.out.println("Enter percent to decrease the price");
        books.changePriceDown();
        books.viewAll();
        System.out.println("Enter name of author: ");
        books.searchAuthor().viewAll();
        System.out.println("Enter year: ");
        books.searchYear().viewAll();

        // empty array
        Books books1 = new Books(2);
        System.out.println("Enter percent to increase the price");
        books1.changePriceUp();
        books1.viewAll();
        System.out.println("Enter percent to decrease the price");
        books1.changePriceDown();
        books1.viewAll();
        System.out.println("Enter name of author: ");
        books1.searchAuthor().viewAll();
        System.out.println("Enter year: ");
        books1.searchYear().viewAll();
    }
}
