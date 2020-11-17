package book;

import java.util.concurrent.TimeUnit;

public class Image implements Element{

    private String imageName;

    public Image(){

    }

    public Image(String imageName){

        this.imageName = imageName;

        try {

            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e){

            e.printStackTrace();
        }
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print(){
        System.out.println("This image name is : " + this.imageName);
    }
}