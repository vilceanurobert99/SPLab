public class Paragraph implements Element {
    private String text;

    public Paragraph(String name){
        this.text = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Paragraph text: " + text);
    }
}