package model;

import services.AlignStrategy;

public class Paragraph implements Element{

    private String text;
    private AlignStrategy textAlignemnt;

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

    public AlignStrategy getTextAlignemnt() {
        return textAlignemnt;
    }

    public void setTextAlignemnt(AlignStrategy textAlignemnt) {
        this.textAlignemnt = textAlignemnt;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}