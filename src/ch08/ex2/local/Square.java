package ch08.ex2.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase");
    }

}
