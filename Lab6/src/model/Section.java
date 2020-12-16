package model;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private List<Element> elements;
    private String title;

    public Section(String title){
        this.elements = new ArrayList<>();
        this.title = title;
    }

    public void addElement(Element element){
        elements.add(element);
    }

    public void removeElement(Element element){
        elements.remove(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}