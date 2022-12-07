package main.java.ro.uvt;

import main.java.ro.uvt.models.Book;
import main.java.ro.uvt.models.DocumentManager;
import ro.uvt.models.Author;

public class Main {
    public static void Printing() {
        DocumentManager.getInstance().getBook().print();
    }

    public static void main(String[] args) throws Exception {
        Book carte = new Book("carte 1");
        carte.addAuthor(new Author("Ionel Popica"));
        DocumentManager.getInstance().setBook(carte);
        Printing();
    }
}