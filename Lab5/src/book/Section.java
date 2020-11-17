package book;

import java.util.ArrayList;

public class Section implements Element{

    private String title;
    private ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    public void addContent(Element element){
        this.elements.add(element);

    }

    public void removeContent(Element element){
        this.elements.remove(element);

    }

    @Override
    public void print(){
        System.out.println(this.title);
        for(Element element: this.elements){
            element.print();
        }
    }
}