package ch02.ex02;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Circle extends Shape {
    int x;
    int y;

    void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public String toString() {
        return super.toString()+" Circle";
    }
}
