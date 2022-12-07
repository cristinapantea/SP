package ro.uvt.models;

public class Author {
    public String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("ro.uvt.models.Author: " + name);
    }
}
