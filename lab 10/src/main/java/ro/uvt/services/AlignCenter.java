package ro.uvt.services;

public class AlignCenter implements AlignStrategy{
    public void render(String text) {
        text = text + "\n";
        int length = text.length() + 10;
        String indent = "%" + length + "s";
        System.out.format(indent, text);
    }


}
