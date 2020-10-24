public class MyBook {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOne = chp1.createChapter("SubChapter 1.1");

        SubChapter sco = chp1.getSubChapter(indexSubChapterOne);
        sco.addElements(new Paragraph("Paragraph 1"));
        sco.addElements(new Paragraph("Paragraph 2"));
        sco.addElements(new Paragraph("Paragraph 3"));
        //sco.addElements(new Image("Image 1"));
        sco.addElements(new Paragraph("Paragraph 4"));
        sco.addElements(new Table("Table 1"));
        sco.addElements(new Paragraph("Paragraph 5"));

        sco.print();
    }
}