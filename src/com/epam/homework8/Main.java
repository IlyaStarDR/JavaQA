package com.epam.homework8;

import com.epam.homework8.books.Books;
import com.epam.homework8.init.InitBook;
import com.epam.homework8.menu.Menu;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Books books = InitBook.initBooks();
        Books books1 = new Books(25);
        Menu menu = new Menu(books);
        menu.menuUser();

    }
}
