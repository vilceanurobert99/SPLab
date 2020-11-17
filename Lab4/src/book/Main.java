package book;

import utils.Dimension;

public class Main {

    public static void main(String []args){

        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson", new Dimension(25,25));
        ImageProxy img2 = new ImageProxy("Kim Kardashian", new Dimension(25,16));
        ImageProxy img3 = new ImageProxy("Kirby Griffin", new Dimension(15,13));
        Section playboyS1 = new Section("Front Cover");
        playboyS1.addContent(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.addContent(img2);
        playboyS2.addContent(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
    }
}