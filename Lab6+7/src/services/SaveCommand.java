package services;

import interfaces.Command;
import model.Book;
import model.Section;
import utils.DocumentManager;

public class SaveCommand implements Command {
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }

    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        book.addContent(section);
    }
}