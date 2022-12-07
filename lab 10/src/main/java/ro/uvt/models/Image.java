package ro.uvt.models;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    public String imageName;
    public String url;
    public Image content;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        System.out.println("ro.uvt.models.Image with name: " + imageName);
    }


}
