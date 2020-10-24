package com.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<Chapter> chapters = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private TableOfContent tableOfContent;
    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int createChapter(String name){
        chapters.add(new Chapter(name));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }

    public List<Chapter> getChapters(){
        return chapters;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public TableOfContent getTableOfContent() {
        return tableOfContent;
    }

    public void setTableOfContent(TableOfContent tableOfContent) {
        this.tableOfContent = tableOfContent;
    }
}