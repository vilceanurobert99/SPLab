package model;

import utils.Dimension;

public class ImageProxy implements Element{

    private String url;
    private Dimension dim;
    private Image image;

    public ImageProxy(String url, Dimension dim) {
        this.url = url;
        this.dim = dim;
    }

    public ImageProxy(String url){
        this.url = url;
        this.dim = new Dimension(460,460);
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

    public Image loadImage(){

        if(image == null){

            image = new Image(url);
        }

        return image;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
