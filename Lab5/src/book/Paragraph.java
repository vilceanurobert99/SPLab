package book;

import utils.AlignStrategy;
import utils.Context;

public class Paragraph implements Element{

    private String text;
    private AlignStrategy textAlignemnt;

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

    public void setAlignStrategy(AlignStrategy textAlignemnt){

        this.textAlignemnt = textAlignemnt;
    }

    @Override
    public void print(){

        if(this.textAlignemnt != null){

            this.textAlignemnt.render(this.text, new Context());
            return;
        }

        System.out.println("This paragraph text is : " + this.text);

    }
}

