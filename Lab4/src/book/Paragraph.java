package book;

public class Paragraph implements Element{

    private String text;

    public Paragraph(){

    }

    public Paragraph(String text){
        this.text = text;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("This paragraph text is : " + this.text);

    }
}