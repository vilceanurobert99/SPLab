package com.utils;

import com.model.Book;

public class DocumentManager {

    private static DocumentManager documentManager;
    private Book book;

    private DocumentManager(){

    }

    public static DocumentManager getDocumentManager() {
        if(documentManager == null)
            documentManager = new DocumentManager();
        return documentManager;
    }

    public void setBook(Book newBook) {
        this.book = newBook;
    }

    public Book getBook() {
        return this.book;
    }
}
