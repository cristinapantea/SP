package main.java.ro.uvt.models;

import ro.uvt.models.Element;
import ro.uvt.services.AlignStrategy;

public class Paragraph implements Element {
    public String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public int get() {
        return 0;
    }

    public void setAlignStrategy(AlignStrategy align) {
        align.render(this.text);
    }

    public void print() {
        System.out.println("ro.uvt.models.Paragraph: " + text);
    }
}

