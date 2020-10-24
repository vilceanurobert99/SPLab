import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private List<Element> elements = new ArrayList<>();
    private String name;

    public SubChapter(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addElements(Element element){
        elements.add(element);
    }

    public void print(){
        System.out.println("Name of subChapter: " + name);
        System.out.println("******Elements of this subChapter *******");
        for(Element e : elements)
            e.print();
    }
}