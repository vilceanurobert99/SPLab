package com.utils;

public class Dimension {
    private int height;
    private int width;

    public Dimension(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printDimension(){
        System.out.println("Inaltime: " + height + " " + " latime: " + width);
    }
}