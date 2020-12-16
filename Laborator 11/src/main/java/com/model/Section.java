package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor(force = true)
public class Section extends Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(cascade =  {CascadeType.DETACH, CascadeType.MERGE, CascadeType.MERGE})
    @JoinTable(
            name = "element_section",
            joinColumns = @JoinColumn(name = "section_id"),
            inverseJoinColumns = @JoinColumn(name = "element_id")
    )
    private List<Element> elements;
    @Column(name = "title")
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
