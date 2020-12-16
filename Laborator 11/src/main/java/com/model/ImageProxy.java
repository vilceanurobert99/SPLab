package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;
import com.utils.Dimension;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@NoArgsConstructor(force = true)
@Table(name = "image_proxy")
public class ImageProxy extends Element{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    @Transient
    private Dimension dim;
    @Transient
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
