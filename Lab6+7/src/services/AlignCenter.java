
package services;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String paragraph, Context context) {

        System.out.println("Align center: " + paragraph);
    }
}