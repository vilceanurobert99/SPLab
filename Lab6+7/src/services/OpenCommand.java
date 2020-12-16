package services;

import interfaces.Command;
import model.*;
import utils.DocumentManager;

public class OpenCommand implements Command {
    private String title;

    public OpenCommand(String title) {
        this.title = title;
    }

    @Override
    public void execute() {
        Book book = new Book(title);
        Author author = new Author("Author1");
        book.addAuthor(author);

        Section cap1 = new Section("Chapter 1");
        Paragraph paragraph1 = new Paragraph("Paragraph 1");
        cap1.addElement(paragraph1);
        Paragraph paragraph2 = new Paragraph("Paragraph 2");
        cap1.addElement(paragraph2);
        Paragraph paragraph3 = new Paragraph("Paragraph 3");
        cap1.addElement(paragraph3);
        book.addContent(cap1);

        Table t1 = new Table("Table1");
        book.addContent(t1);

        Image im = new Image("Image1");
        book.addContent(im);

        System.out.println("Opening...");

        DocumentManager documentManager = DocumentManager.getDocumentManager();
        documentManager.setBook(book);
    }
}