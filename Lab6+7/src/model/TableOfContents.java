package model;

public class TableOfContents implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}