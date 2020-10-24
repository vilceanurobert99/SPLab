import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private List<SubChapter> subChapters = new ArrayList<>();
    private String name;

    public Chapter(String name){
        this.name = name;
    }

    public int createChapter(String name){
        this.subChapters.add(new SubChapter(name));
        return subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public void addSubChapter(SubChapter subChapter){
        this.subChapters.add(subChapter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}