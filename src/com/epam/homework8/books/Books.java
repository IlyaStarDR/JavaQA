package com.epam.homework8.books;

import com.epam.homework8.comparator.NameComparator;
import com.epam.homework8.comparator.PriceComparator;
import com.epam.homework8.comparator.PublisherComparator;
import com.epam.homework8.exception.EmptyArrayRuntimeException;
import com.epam.homework8.validator.Validator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Books implements Cloneable {
    private Book[] listOfBooks;
    private int counter;


    public Books(int length) {
        listOfBooks = new Book[length];
    }

    public void viewAll() throws EmptyArrayRuntimeException {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        }
        for (Book element : listOfBooks) {
            if (element != null) {
                System.out.println(element.toString());
            }

        }
    }

    public void add(Book book) {
        try {
            listOfBooks[counter] = book;
            counter++;
        } catch (IndexOutOfBoundsException e) {
            listOfBooks = Arrays.copyOf(listOfBooks, (int) ((listOfBooks.length + 1) * 1.5));
            add(book);
        }
    }


    public void changePrice(double percent, char plusOrMinus) {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        } else if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Illegal percent");
        }
        workWithPrice(percent, plusOrMinus);
    }

    public Books searchAuthor(String author) {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        }
        return getBooks(author);
    }

    private void workWithPrice(double percent, char plusOrMinus) {
        for (Book element : listOfBooks) {
            if (element != null) {
                switch (plusOrMinus) {
                    case '+':
                        element.setPrice(element.getPrice() + element.getPrice() * percent / 100);
                        break;
                    case '-':
                        element.setPrice(element.getPrice() - element.getPrice() * percent / 100);
                        break;
                }
            }
        }
    }

    private Books getBooks(String author) {
        Books books = new Books(listOfBooks.length);
        for (Book element : listOfBooks) {
            if (element != null && element.getAuthor().equals(author)) {
                books.add(element);
            }
        }
        return books;
    }

    public Books searchYear(int year) {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        }
        return getYearOfBook(year);
    }

    private Books getYearOfBook(int year) {
        Books books = new Books(listOfBooks.length);
        for (Book element : listOfBooks) {
            if (element != null && element.getYearOfPublishing() > year && year < 0) {
                books.add(element);
            } else {
                throw new IllegalArgumentException("Illegal year");
            }
        }
        return books;
    }

    @Override
    public Books clone() throws CloneNotSupportedException {
        Books clone = (Books) super.clone();
        clone.listOfBooks = Arrays.copyOf(listOfBooks, listOfBooks.length);
        return clone;
    }

    public void getNameOfAuthorCompared() {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        }
        Arrays.sort(listOfBooks, new NameComparator());
    }

    public void getPublishingHouseCompared() {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        }
        Arrays.sort(listOfBooks, new PublisherComparator());
    }

    public void getPriceCompared() {
        if (Validator.isEmpty(listOfBooks)) {
            throw new EmptyArrayRuntimeException("Bookshelf is empty");
        }
        Arrays.sort(listOfBooks, new PriceComparator());
    }
}