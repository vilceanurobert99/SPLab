import com.book.*;

public class MyBook {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");

        noapteBuna.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subcapitolul 1.1.1.1");

        noapteBuna.addContent(new Paragraph("Multumesc tuturor care au facut posibila...."));
        noapteBuna.addContent(cap1);
        cap1.addElement(new Paragraph("Moto capitol"));
        cap1.addElement(cap11);
        cap11.addElement(new Paragraph("Text from subchapter 1.1"));
        cap11.addElement(cap111);
        cap111.addElement(new Paragraph("text from subchapter 1.1.1"));
        cap111.addElement(cap1111);
        cap1111.addElement(new Image("Image from subchapter 1.1.1.1"));

        noapteBuna.print();

    }
}