package ro.uvt.models;

public class Table implements Element {
    public String title;

    public Table(String title) {
        this.title = title;
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

    public void print() {
        System.out.println("ro.uvt.models.Table with title: " + title);
    }
}
