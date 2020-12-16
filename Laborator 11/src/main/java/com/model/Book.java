package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(force = true)
@Entity
public class Book extends Element{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "book")
    private List<Author> authors;

    @Column(name = "title")
    private String title;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private TableOfContents tableOfContents;

    @ManyToMany(cascade =  {CascadeType.DETACH, CascadeType.MERGE, CascadeType.MERGE})
    @JoinTable(
            name = "element_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "element_id")
    )
    private final List<Element> elements;

    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addElements(Element e){
        this.elements.add(e);
    }

    public List<Element> getElements() {
        return elements;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void addAuthor(Author author){
        this.authors.add(author) ;

    }

    public List<Author> getAuthors(){
        return this.authors;

    }

    public void addContent(Element element){
        this.elements.add(element);

    }

    public List<Element> getContents(){
        return this.elements;

    }

    public TableOfContents getTableOfContent() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
