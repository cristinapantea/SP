public class AlignLeft implements AlignStrategy{

    public void render(String text) {
        text = text + "\n";
        int length = text.length();
        String indent = "%-" + length + "s";
        System.out.format(indent, text);
    }
}
