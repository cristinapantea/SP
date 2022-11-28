public class AlignRight implements AlignStrategy {

    public void render(String text) {
        text = text + "\n";
        int length = text.length() + 20;
        String indent = "%" + length + "s";
        System.out.format(indent, text);
    }
}
