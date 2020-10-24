package com.book;

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

    @Override
    public void print() {
        System.out.println(title);
        for(Element e: elements)
            e.print();
    }
}