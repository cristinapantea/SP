package ro.uvt.models;

import java.awt.*;

public class ImageProxy implements Element {
    public String url;
    public Dimension dim;
    public Image realImage;

    public ImageProxy(String url) {
        this.url = url;
//        this.dim = dim;
    }

    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
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

    @Override
    public void print() {

    }
}
