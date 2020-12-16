package com.services;

import com.interfaces.Command;
import com.model.Book;
import com.utils.DocumentManager;

public class StatisticsCommand implements Command {
    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        BookStatistics bookStatistics = new BookStatistics();
        PrintContentsVisitor printContentVisitor = new PrintContentsVisitor();
        book.accept(bookStatistics);
        bookStatistics.printCounter();
        book.accept(printContentVisitor);
    }
}
