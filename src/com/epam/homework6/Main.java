package com.epam.homework6;

public class Main {
    public static void main(String[] args) {
        Books books = new Books(5);
//        books.add(new Book(1, "Преданная революция", "Лев Давидович Троцкий", "- ", 1936, 189, 200));
//        Book book = new Book(2, "Cтарик и Mоре", "Эрнест Хемингуэй", "Charles Scribner's Sons", 1936, 98, 145);
//        books.add(book);
//        books.add(new Book(3, "1984", "Джордж Оруэлл", "АСТ", 1948, 250, 435));
//        books.add(new Book(4, "Cтарик и Mоре", "Эрнест Хемингуэй", "Charles Scribner's Sons", 1936, 98, 145));
//        books.add(new Book(5, "Cтарик и Mоре", "Эрнест Хемингуэй", "Charles Scribner's Sons", 1936, 98, 145));
//        books.add(new Book(6,"Cтарик и Mоре", "Эрнест Хемингуэй", "Charles Scribner's Sons", 1936, 98, 145));
//        books.changePrice();
        books.searchAuthor().viewAll();
        books.searchYear().viewAll();
//        books.viewAll();

//        books.add();
//
//        books.changePrice('-',80);
//        books.viewAll();
//
    }
}
