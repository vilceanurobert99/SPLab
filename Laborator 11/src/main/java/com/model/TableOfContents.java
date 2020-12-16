package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@NoArgsConstructor(force = true)
@Table(name = "table_of_content")
public class TableOfContents extends Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "tableOfContents")
    private Book book;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
