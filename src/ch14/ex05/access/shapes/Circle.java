package ch14.ex05.access.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Circle extends Shape {
    public Circle() {
    }

    public void draw() {
        System.out.println("Draw.Circle");
    }
    public void rotate() {
        System.out.println("Rotate.Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Circle");
        super.dispose();

    }
}
