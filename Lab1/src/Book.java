import java.awt.*;
import java.util.ArrayList;

public class Book {
    private final String title;
    private final ArrayList<String> paragraph = new ArrayList<String>();
    private final ArrayList<String> image = new ArrayList<String>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph){
        this.paragraph.add(paragraph);
    }

    public void createNewImage(String image){
        this.image.add(image);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraph=" + paragraph +
                ", image=" + image +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }
}