import model.*;
import services.BookStatistics;
import services.PrintContentsVisitor;

public class Main {

    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addElement(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addElement(p4);
        cap1.addElement(new ImageProxy("ImageOne"));
        cap1.addElement(new Image("ImageTwo"));
        cap1.addElement(new Paragraph("Some text"));
        cap1.addElement(new Table("Table 1"));
        PrintContentsVisitor printer = new PrintContentsVisitor();
        BookStatistics bookStatistics = new BookStatistics();
        cap1.accept(printer);
        cap1.accept(bookStatistics);
        bookStatistics.printCounter();
    }
}