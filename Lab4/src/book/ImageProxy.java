package book;

import utils.Dimension;

public class ImageProxy implements Element{

    private String url;
    private Dimension dim;
    private Image image;

    public ImageProxy(String url, Dimension dim) {
        this.url = url;
        this.dim = dim;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    private Image loadImage(){

        if(image == null){

            image = new Image(url);
        }

        return image;
    }

    @Override
    public void print() {

        this.loadImage().print();
        dim.printDimension();
    }
}