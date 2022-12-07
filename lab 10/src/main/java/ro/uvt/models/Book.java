package main.java.ro.uvt.models;
import ro.uvt.models.Author;
import ro.uvt.models.Element;

public class Book extends Section {
    public String title;
    Author author;

    public Book(String title) {
        super();
        this.title = title;
    }

    public void addAuthor(Author name) {
        this.author = name;
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("main.java.ro.uvt.models.Book: " + this.title);
        author.print();
        for(Element els : elements) {
            els.print();
        }
    }

}
