package main.java.ro.uvt.models;

public class DocumentManager {
    private Book book;
    private static DocumentManager instance = null;

    public static DocumentManager getInstance() {
        if(instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
