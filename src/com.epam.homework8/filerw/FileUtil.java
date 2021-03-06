package com.epam.homework8.filerw;

import com.epam.homework8.books.Books;
import com.epam.homework8.exception.EmptyArrayRuntimeException;
import com.epam.homework8.init.InitBook;


import java.io.*;

public class FileUtil {
    public static String fileName;

    public static void writeData() {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(InitBook.initBooks());
        } catch (IOException e) {
            throw new EmptyArrayRuntimeException();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Some error occurred while closing read file...");
            }
        }
    }

    public static Books readData() {
        Books books;
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            books = (Books) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new EmptyArrayRuntimeException("File isn't read");
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Some error occurred while closing read file...");
            }
        }
        return books;
    }

}
